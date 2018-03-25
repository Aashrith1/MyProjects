/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.OrderItem;
import static Business.Organization.Organization.Type.Supplier;
import Business.Products.Product;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author anand
 */
public class ManagerEcoguardlink extends javax.swing.JPanel {

    /**
     * Creates new form ManagerEcoguardlink
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem system;
    DB4OUtil dB4OUtil;
    OrderItem orderItem;
    String eName;

    public ManagerEcoguardlink() {
        initComponents();
    }

    ManagerEcoguardlink(JPanel userProcessContainer, EcoSystem system, DB4OUtil dB4OUtil, OrderItem orderItem, String eName, Enterprise enterprise) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.orderItem = orderItem;
        this.enterprise = enterprise;
        this.eName = eName;
        populateTable();
        populateAlteredTable();
        fullscreen();
    }

    public void fullscreen() {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heigth = Toolkit.getDefaultToolkit().getScreenSize().height;
        jLabel3.setSize(width, heigth);
    }

    public void populateAlteredTable() {
        DefaultTableModel dtm = (DefaultTableModel) alteredtable.getModel();
        dtm.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().equalsIgnoreCase(eName)) {
                    for (Supplier S : network.getSupplierDirectory().getSupplierList()) {
                        for (Product P : S.getProductDirectory().getProductList()) {
                            //for (OrderItem oi : e.getOrder().getOrderItemList()) {
                            if (P.getProdType().equalsIgnoreCase("Bamboo")
                                    && orderItem.getProduct().getProdName().equalsIgnoreCase(P.getProdName())) {

                                Object[] row = new Object[10];
                                row[0] = e.getName();
                                row[1] = orderItem.getOrderID();
                                row[2] = P.getProdName();
                                row[3] = P.getProdType();
                                row[4] = orderItem.getProduct().getQuantity();
                                row[5] = orderItem.getProduct().getQuantity() * P.getProdPrice();
                                row[6] = P.getCordUsed() * orderItem.getProduct().getQuantity();
                                row[7] = S.getSupplierID();
                                row[8] = "Open";
                                dtm.addRow(row);
                            }

                            // }
                        }
                    }
                }
            }
        }
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) originaltable.getModel();
        dtm.setRowCount(0);

        Object[] row = new Object[10];
        row[0] = eName;
        row[1] = orderItem.getOrderID();
        row[2] = orderItem.getProduct().getProdName();
        row[3] = orderItem.getProduct().getProdType();
        row[4] = orderItem.getProduct().getQuantity();
        row[5] = orderItem.getSalesPrice();
        row[6] = orderItem.getAmtOfWood();
        row[7] = orderItem.getDateOfOrder();
        row[8] = orderItem.getOrderStatus() == null ? "-" : orderItem.getOrderStatus();
        dtm.addRow(row);

    }

    public void goBack() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerWorkAreaJPanel dwjp = (ManagerWorkAreaJPanel) component;
        dwjp.populateBtnTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeOrderBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        alteredtable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        originaltable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NoChangeBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        charityCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        changeOrderBtn.setText("Change Order");
        changeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeOrderBtnActionPerformed(evt);
            }
        });
        add(changeOrderBtn);
        changeOrderBtn.setBounds(384, 672, 130, 30);

        alteredtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EnterpriseName", "OrderID", "ProductName", "ProductType", "Quantity", "TotalAmount", "Cord Required", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(alteredtable);

        add(jScrollPane1);
        jScrollPane1.setBounds(61, 417, 1008, 139);

        originaltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EnterpriseName", "OrderID", "ProductName", "ProductType", "Quantity", "TotalAmount", "Cord Required", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(originaltable);

        add(jScrollPane2);
        jScrollPane2.setBounds(52, 186, 1017, 106);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TO");
        add(jLabel1);
        jLabel1.setBounds(497, 325, 82, 52);

        NoChangeBtn.setText("No , Dont change");
        NoChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoChangeBtnActionPerformed(evt);
            }
        });
        add(NoChangeBtn);
        NoChangeBtn.setBounds(588, 672, 157, 29);

        jButton1.setText("Gmail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(215, 672, 73, 29);

        charityCheckBox.setText("Go Green");
        charityCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charityCheckBoxActionPerformed(evt);
            }
        });
        charityCheckBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                charityCheckBoxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                charityCheckBoxKeyTyped(evt);
            }
        });
        add(charityCheckBox);
        charityCheckBox.setBounds(99, 591, 99, 29);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ECO GUARD SUGGESTIONS");
        add(jLabel2);
        jLabel2.setBounds(272, 35, 509, 93);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Manager/forest85.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1110, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void changeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeOrderBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = alteredtable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to continue");
            return;

        } else {

            String eName = alteredtable.getValueAt(selectedRow, 0).toString();
            String prodType = alteredtable.getValueAt(selectedRow, 3).toString();
            double price = Double.parseDouble(alteredtable.getValueAt(selectedRow, 5).toString());
            int cord = Integer.parseInt(alteredtable.getValueAt(selectedRow, 6).toString());
            int supplierID = Integer.parseInt(alteredtable.getValueAt(selectedRow, 7).toString());
            String prodName = alteredtable.getValueAt(selectedRow, 2).toString();

            int Quantity = Integer.parseInt(alteredtable.getValueAt(selectedRow, 4).toString());

            
            orderItem.setDateOfOrder(new Date());
            orderItem.getProduct().setProdType(prodType);
            orderItem.setSalesPrice(price);
            orderItem.getProduct().setCordUsed(cord);
            orderItem.setOrderStatus("ORDER PLACED");
            orderItem.setFinalStatus("Success");
            orderItem.getProduct().setQuantity(Quantity);

            if (charityCheckBox.isSelected()) {
                enterprise.setContribution(enterprise.getContribution() + (price * 0.01));
            }


            JOptionPane.showMessageDialog(null, "Order Changed");
            goBack();
        }


    }//GEN-LAST:event_changeOrderBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("http://www.gmail.com").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NoChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoChangeBtnActionPerformed
        // TODO add your handling code here:
        orderItem.setFinalStatus("Fail");
        orderItem.setOrderStatus("ORDER PLACED");
        double price = orderItem.getSalesPrice();
        int selectedRow = alteredtable.getSelectedRow();

        //int Quantity = Integer.parseInt(alteredtable.getValueAt(selectedRow, 4).toString());
        //String prodName = alteredtable.getValueAt(selectedRow, 2).toString();
        String prodType = orderItem.getProduct().getProdType();
        String prodName = orderItem.getProduct().getProdName();
        int Quantity = orderItem.getProduct().getQuantity();
        

        if (charityCheckBox.isSelected()) {
            enterprise.setContribution(enterprise.getContribution() + (price * 0.01));
            //System.out.println(enterprise.getContribution());
        }
        JOptionPane.showMessageDialog(null, "Order Placed without any changes");
        goBack();


    }//GEN-LAST:event_NoChangeBtnActionPerformed

    private void charityCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charityCheckBoxActionPerformed


    }//GEN-LAST:event_charityCheckBoxActionPerformed

    private void charityCheckBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_charityCheckBoxKeyTyped
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "ashajhsa");
    }//GEN-LAST:event_charityCheckBoxKeyTyped

    private void charityCheckBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_charityCheckBoxKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_charityCheckBoxKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NoChangeBtn;
    private javax.swing.JTable alteredtable;
    private javax.swing.JButton changeOrderBtn;
    private javax.swing.JCheckBox charityCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable originaltable;
    // End of variables declaration//GEN-END:variables
}
