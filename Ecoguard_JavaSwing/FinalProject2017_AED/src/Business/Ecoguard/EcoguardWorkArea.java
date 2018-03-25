/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecoguard;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.OrderItem;
import Business.Products.Product;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import UserInterface.CardPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Aashrith
 */
public class EcoguardWorkArea extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem system;
    DB4OUtil dB4OUtil;

    public EcoguardWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system, DB4OUtil dB4OUtil) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        populateTable();
        fullscreen();

    }

    public void fullscreen() {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heigth = Toolkit.getDefaultToolkit().getScreenSize().height;
        jLabel2.setSize(width, heigth);
    }

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) EcoguardTable.getModel();
        for (Network network : system.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (OrderItem oi : e.getOrder().getOrderItemList()) {
                    if (oi.getOrderStatus().equalsIgnoreCase("Approved")) {
                        Object[] row = new Object[10];
                        row[0] = e;
                        row[1] = oi;
                        row[2] = oi.getProduct().getProdType();
                        row[3] = oi.getProduct().getQuantity();
                        row[4] = oi.getSalesPrice();
                        row[5] = oi.getAmtOfWood();
                        row[6] = oi.getDateOfOrder();
                        dtm.addRow(row);
                    }
                }
            }
        }
    }

    public JFreeChart barChartFunction(String enterpriseName) {

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        String a = " ";
        HashMap<String, Double> hMap = new HashMap<String, Double>();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        String b = currentDate.substring(0, 4);
        int currentYear = Integer.parseInt(b);

        for (Network network : system.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().equalsIgnoreCase(enterpriseName)) {
                    a += e.getName() + " ";
                    for (OrderItem oi : e.getOrder().getOrderItemList()) {

                        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                        String s = formatter.format(oi.getDateOfOrder());
                        String x = s.substring(0, 4);
                        int orderYear = Integer.parseInt(x);
                        int lowerlimit = currentYear - 5;
                        if (orderYear >= lowerlimit && orderYear < currentYear) {
                            double totalSalesPrice = hMap.containsKey(x) ? hMap.get(x) : 0;
                            totalSalesPrice = totalSalesPrice + oi.getSalesPrice();
                            hMap.put(x, totalSalesPrice);
                        }
                    }
                }
            }
        }

        for (String key : hMap.keySet()) {
            dcd.setValue(hMap.get(key), "Money Spent by" + enterpriseName, key);
        }

        for (Network network : system.getNetworkList()) {
            if (network.getName().equalsIgnoreCase("Chicago")) {
                for (Supplier S : network.getSupplierDirectory().getSupplierList()) {
                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.getName().equalsIgnoreCase(enterpriseName)) {
                            for (OrderItem oi : e.getOrder().getOrderItemList()) {
                                Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                                String s = formatter.format(oi.getDateOfOrder());
                                String x = s.substring(0, 4);
                                int orderYear = Integer.parseInt(x);
                                int lowerlimit = currentYear - 5;
                                if (orderYear >= lowerlimit && orderYear < currentYear) {
                                    String prodName = oi.getProduct().getProdName();
                                    String prodType = oi.getProduct().getProdType();
                                    double minPrice = getValue(prodName, prodType);
                                    dcd.setValue(minPrice * (oi.getProduct().getQuantity()), "Money", x);
                                }
                            }
                        }
                    }
                }
            }
        }
        JFreeChart jChart = ChartFactory.createBarChart3D(a + " \t Total Money Spent on recent orders", "Year", "Total Money Spent", dcd, PlotOrientation.VERTICAL, false, false, false);

        jChart.setBackgroundPaint(Color.ORANGE);
        CategoryPlot plot = jChart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.darkGray);

        CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true);
        DecimalFormat decmalFormat = new DecimalFormat("##.##");
        renderer.setItemLabelGenerator(new org.jfree.chart.labels.StandardCategoryItemLabelGenerator("{2}", decmalFormat));
        try {
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file1 = new File("Barchart.png");
            ChartUtilities.saveChartAsJPEG(file1, jChart, 600, 400, info);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return jChart;

    }

    public JFreeChart areaChartFunction(String enterpriseName) {

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        HashMap<String, Double> hMap = new HashMap<String, Double>();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        String a = currentDate.substring(0, 4);
        int currentYear = Integer.parseInt(a);

        for (Network network : system.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {

                for (OrderItem oi : e.getOrder().getOrderItemList()) {
                    Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                    String s = formatter.format(oi.getDateOfOrder());
                    String x = s.substring(0, 4);
                    int orderYear = Integer.parseInt(x);
                    int lowerLimit = currentYear - 5;
                    if (orderYear >= lowerLimit && orderYear < currentYear) {
                        double price = hMap.containsKey(x) ? hMap.get(x) : 0;
                        price = price + oi.getAmtOfWood();
                        hMap.put(x, price);
                    }
                }
            }
        }

        for (String key : hMap.keySet()) {
            dcd.setValue(hMap.get(key), "Amount of Wood Used:", key);
        }
        
           for (Network network : system.getNetworkList()) {
            if (network.getName().equalsIgnoreCase("Chicago")) {
                for (Supplier S : network.getSupplierDirectory().getSupplierList()) {
                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.getName().equalsIgnoreCase(enterpriseName)) {
                            for (OrderItem oi : e.getOrder().getOrderItemList()) {
                                Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                                String s = formatter.format(oi.getDateOfOrder());
                                String x = s.substring(0, 4);
                                int orderYear = Integer.parseInt(x);
                                int lowerlimit = currentYear - 5;
                                if (orderYear >= lowerlimit && orderYear < currentYear) {
                                    String prodName = oi.getProduct().getProdName();
                                    String prodType = oi.getProduct().getProdType();
                                    double minCordUsed = getMinCordUsed(prodName, prodType);
                                    dcd.setValue(minCordUsed+125, "Wood if Bamboo was used", x);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        

//        dcd.setValue(6883, "Wood used if efficient material used", "2012");
//        dcd.setValue(8883, "Wood used if efficient material used", "2013");
//        dcd.setValue(8683, "Wood used if efficient material used", "2014");
//        dcd.setValue(3883, "Wood used if efficient material used", "2015");
//        dcd.setValue(4583, "Wood used if efficient material used", "2016");

        JFreeChart jChart = ChartFactory.createAreaChart("Wood Consumption", "Year", "Amount of Cord Used", dcd, PlotOrientation.VERTICAL, true, true, true);
        jChart.setBackgroundPaint(Color.ORANGE);

        CategoryPlot plot = jChart.getCategoryPlot();

        try {
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file1 = new File("Areachart.png");
            ChartUtilities.saveChartAsJPEG(file1, jChart, 600, 400, info);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return jChart;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EcoguardTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        chartpageBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        EcoguardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EnterpriseName", "ProductName", "ProductType", "Quantity", "TotalAmount", "Cord Required", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EcoguardTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 170, 890, 207);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(20, 673, 110, 50);

        chartpageBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chartpageBtn.setText("Analysis Chart");
        chartpageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartpageBtnActionPerformed(evt);
            }
        });
        add(chartpageBtn);
        chartpageBtn.setBounds(279, 480, 180, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Self Analysis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(470, 480, 160, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel1);
        jLabel1.setBounds(461, 70, 180, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Ecoguard/Gree-Trees-Forest-Path-One-Way-Straight-Road-Landscape-Summer-WallpapersByte-com-1920x1080.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1150, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardPanel cardPanel = new CardPanel(userProcessContainer, system, dB4OUtil);
        userProcessContainer.add("Login Screen", cardPanel);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton2ActionPerformed

    public double getValue(String prodName, String prodType) {
        String productName = prodName;
        String productType = prodType;
        ArrayList<Integer> integerList = new ArrayList<>();
        int minPrice = 0;
        int x = 0;

        for (Network network : system.getNetworkList()) {
            if (network.getName().equalsIgnoreCase("Chicago")) {
                for (Supplier S : network.getSupplierDirectory().getSupplierList()) {
                    for (Product P : S.getProductDirectory().getProductList()) {
                        if (productName.equalsIgnoreCase(P.getProdName()) && P.getProdType().equalsIgnoreCase("Bamboo")) {
                            integerList.add(P.getProdPrice());
                        }
                    }
                }
            }
        }

        int b = integerList.get(0);
        for (Integer a : integerList) {
            b = b < a ? b : a;
        }

        double dbl = (double) b;

        return dbl;

    }

    public double getMinCordUsed(String prodName, String prodType) {
        String productName = prodName;
        String productType = prodType;
        ArrayList<Integer> integerList = new ArrayList<>();
        int minPrice = 0;
        int x = 0;

        for (Network network : system.getNetworkList()) {
            if (network.getName().equalsIgnoreCase("Chicago")) {
                for (Supplier S : network.getSupplierDirectory().getSupplierList()) {
                    for (Product P : S.getProductDirectory().getProductList()) {
                        if (productName.equalsIgnoreCase(P.getProdName()) && P.getProdType().equalsIgnoreCase("Bamboo")) {
                            integerList.add(P.getCordUsed());
                        }
                    }
                }
            }
        }

        int b = integerList.get(0);
        for (Integer a : integerList) {
            b = b < a ? b : a;
        }

        double dbl = (double) b;

        return dbl;

    }


    private void chartpageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartpageBtnActionPerformed
        // TODO add your handling code here:

        int selectedrow = EcoguardTable.getSelectedRow();
        OrderItem order = (OrderItem) EcoguardTable.getValueAt(selectedrow, 1);
        String enterpriseName = EcoguardTable.getValueAt(selectedrow, 0).toString();
        JFreeChart barchart = barChartFunction(enterpriseName);
        JFreeChart areachart = areaChartFunction(enterpriseName);

        EJPanel panel = new EJPanel(barchart, areachart, userProcessContainer, system, order);
        userProcessContainer.add("panel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_chartpageBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        EcoguardSelfAnalysis panel = new EcoguardSelfAnalysis(userProcessContainer, account, enterprise, system, dB4OUtil);
        userProcessContainer.add("panel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EcoguardTable;
    private javax.swing.JButton chartpageBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
