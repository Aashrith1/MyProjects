/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Designer;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.OrderItem;
import Business.Products.Product;
import Business.Supplier.Supplier;
import Business.WorkQueue.ProvoiderRequest;
import UserInterface.CardPanel;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dawn
 */
public class SearchJPanel1 extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    int quantity;
    String ProdName;
    String ProdType;
    Enterprise enterprise;
    DB4OUtil dB4OUtil;
    ProvoiderRequest wr;
    static int count = 6;

    SearchJPanel1(JPanel userProcessContainer, EcoSystem system, String prodName, String prodType, int quantity, DB4OUtil dB4OUtil, ProvoiderRequest wr, Enterprise enterprise) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.ProdName = prodName;
        this.enterprise = enterprise;
        this.ProdType = prodType;
        this.quantity = quantity;
        this.wr = wr;
        this.dB4OUtil = dB4OUtil;
        populateTable();
        fullscreen();
    }

    public void fullscreen() {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heigth = Toolkit.getDefaultToolkit().getScreenSize().height;
        GenLabel.setSize(width, heigth);
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) productJTable.getModel();
        dtm.setRowCount(0);
        for (Network N : system.getNetworkList()) {
            if (N.getName().equalsIgnoreCase("Chicago")) {
                for (Supplier s : N.getSupplierDirectory().getSupplierList()) {
                    for (Product P : s.getProductDirectory().getProductList()) {
                        if (P.getProdName().equalsIgnoreCase(ProdName) && P.getProdType().equalsIgnoreCase(ProdType)) {
                            Object[] row = new Object[6];
                            row[0] = P.getProdName();
                            row[1] = P.getProdType();
                            row[2] = s.getSupplierName();
                            row[3] = P.getProdPrice();
                            row[4] = s.getSupplierRating();
                            row[5] = s.getSupplierID();
                            dtm.addRow(row);

                        }
                    }
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        GenLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setLayout(null);

        productJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Type", "Supplier", "Product Price", "Supplier Rating", "Supplier ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(160, 200, 840, 150);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Generate Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(520, 529, 180, 60);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(980, 670, 180, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Supplier Screen");
        add(jLabel1);
        jLabel1.setBounds(260, 10, 100, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel3);
        jLabel3.setBounds(410, 420, 350, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("<<BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(70, 695, 110, 30);

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Invoice Generation");
        add(jLabel2);
        jLabel2.setBounds(220, 40, 510, 110);

        GenLabel.setForeground(new java.awt.Color(255, 255, 255));
        GenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Designer/summer_trees-wallpaper-1920x1080.jpg"))); // NOI18N
        GenLabel.setText("BACK");
        add(GenLabel);
        GenLabel.setBounds(0, 0, 1190, 780);

        jButton3.setText("<<Back");
        add(jButton3);
        jButton3.setBounds(10, 720, 130, 40);
    }// </editor-fold>//GEN-END:initComponents
public void function(Product x, int quantity, double price, int wrkReqNumber) throws ParseException {
    
         int selectedrow = productJTable.getSelectedRow();
        int supplierID = Integer.parseInt(productJTable.getValueAt(selectedrow, 5).toString());
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        // Thread.sleep(3000);
        for (Network n : system.getNetworkList()) {
            if (n.getName().equalsIgnoreCase("Chicago")) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getName().equalsIgnoreCase(enterprise.getName())) {
                        e.getOrder().addOrderItem(supplierID, count, x, quantity, currentDate, wrkReqNumber);
                       // JOptionPane.showMessageDialog(null, "Order Generated");
                        count++;
                        //this.currentorder = count;
                    }
                }
            }

        }

    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel3.setText("Please wait ur order is being generated");

       SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
           @Override
           protected Void doInBackground() throws Exception {
               Thread.sleep(3000);
               int selectedrow = productJTable.getSelectedRow();
               if (selectedrow < 0) {
                   JOptionPane.showMessageDialog(null, "Please enter a row");
                   //  return;
               }

               int x = Integer.parseInt(productJTable.getValueAt(selectedrow, 5).toString());
               double price = Double.parseDouble(productJTable.getValueAt(selectedrow, 3).toString());

               for (Network n : system.getNetworkList()) {
                   //  if (n.getName().equalsIgnoreCase("Chicago")) {
                   for (Supplier S : n.getSupplierDirectory().getSupplierList()) {
                       for (Product p : S.getProductDirectory().getProductList()) {
                           if (S.getSupplierID() == x && p.getProdName().equalsIgnoreCase(ProdName) && p.getProdType().equalsIgnoreCase(ProdType)) {
                               try {
                                   function(p, quantity, price, wr.getWrkReqnumber());
                               } catch (ParseException ex) {
                                   Logger.getLogger(SearchJPanel1.class.getName()).log(Level.SEVERE, null, ex);
                               }
                           }
                       }
                   }
                   // }
               }

               return null;

           }

           @Override
           protected void done() {
               jLabel3.setText("Your order is successfully generated");
               JOptionPane.showMessageDialog(null, "Order Generated");
           }
       };

       worker.execute();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardPanel cardPanel = new CardPanel(userProcessContainer, system, dB4OUtil);
        userProcessContainer.add("Login Screen", cardPanel);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GenLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productJTable;
    // End of variables declaration//GEN-END:variables
}
