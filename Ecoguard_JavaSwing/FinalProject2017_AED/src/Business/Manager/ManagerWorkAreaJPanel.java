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
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import UserInterface.CardPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableColumnModel;

import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Aashrith
 */
public class ManagerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem system;
    DB4OUtil dB4OUtil;
    Boolean isMailSent;

    public ManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.system = business;
        this.dB4OUtil = dB4OUtil;
       // populateTable();
        populateBtnTable();
        fullscreen();
                
    }
    
        public void fullscreen(){
       int width = Toolkit.getDefaultToolkit().getScreenSize().width;
       int heigth = Toolkit.getDefaultToolkit().getScreenSize().height;
       jLabel2.setSize(width, heigth);
   }
    
//    public void populateTable()
//    {
//        DefaultTableModel dtm = (DefaultTableModel) EcoguardTable.getModel();
//        dtm.setRowCount(0);
//        for (Network network : system.getNetworkList()) {
//            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
//                if(e.getName().equalsIgnoreCase("NEU"))
//                {              
//                for (OrderItem oi : e.getOrder().getOrderItemList()) {
//                    Object[] row = new Object[10];
//                    row[0] = e.getName();
//                    row[1] = oi;
//                    row[2] = oi.getProduct().getProdName();
//                    row[3] = oi.getProduct().getProdType();
//                    row[4] = oi.getProduct().getQuantity();
//                    row[5] = oi.getSalesPrice();
//                    row[6] = oi.getAmtOfWood();
//                    row[7] = oi.getDateOfOrder();
//                    row[8] = oi.getOrderStatus() == null?"-":oi.getOrderStatus();
//                    dtm.addRow(row);
//
//                }
//                }
//            }
//        }
//    }
    
      public void populateBtnTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) EcoguardButtonTable.getModel();
        
//        DefaultTableColumnModel dc = (DefaultTableColumnModel) EcoguardButtonTable.getModel();
        
        EcoguardButtonTable.getColumnModel().getColumn(10).setCellRenderer(new ButtonRenderer());

        EcoguardButtonTable.getColumnModel().getColumn(10).setCellEditor(new ButtonEditor(new JTextField()));
        dtm.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for(Supplier s : network.getSupplierDirectory().getSupplierList()){
                    if(e.getName().equalsIgnoreCase(enterprise.getName()))
                        {              
                        for (OrderItem oi : e.getOrder().getOrderItemList()) {
                            if(oi.getSupplierID() == s.getSupplierID()){
                                Object[] row = new Object[20];
                                row[0] = e.getName();
                                row[1] = oi;
                                row[2] = oi.getProduct().getProdName();
                                row[3] = oi.getProduct().getProdType();
                                row[4] = oi.getProduct().getQuantity();
                                row[5] = oi.getSalesPrice();
                                row[6] = oi.getAmtOfWood();
                                row[7] = oi.getDateOfOrder();
                                row[8] = oi.getOrderStatus() == null?"-":oi.getOrderStatus();
                                row[9] = s.getSupplierName();
                                if(oi.getOrderStatus().equalsIgnoreCase("Email Sent By EcoGuard")){  
                                row[10] =  "AVAILABLE"; 
                                }else{
                                row[10] =  "NA";
                                }
                                dtm.addRow(row);
                            }
                        }
                        isMailSent = false;
                        }
                }
            }
        }
    }
      
class ButtonRenderer extends JButton implements  TableCellRenderer
{
  //CONSTRUCTOR
  public ButtonRenderer() {
    //SET BUTTON PROPERTIES
    setOpaque(true);
    
  }
  @Override
  public Component getTableCellRendererComponent(JTable table, Object obj,
      boolean selected, boolean focused, int row, int col) {
    
    //SET PASSED OBJECT AS BUTTON TEXT
      setText((obj==null) ? "":obj.toString());
      
        
    return this;
  }
  
}
//BUTTON EDITOR CLASS
class ButtonEditor extends DefaultCellEditor
{
  protected JButton btn;
   private String lbl;
   private Boolean clicked;
   
   public ButtonEditor(JTextField txt) {
    super(txt);
    
    btn=new JButton();
    btn.setOpaque(true);
    btn.setVisible(true);
    btn.setActionCommand("Click");
    
    //WHEN BUTTON IS CLICKED
    btn.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        
        fireEditingStopped();
      }
    });
  }
   
   //OVERRIDE A COUPLE OF METHODS
   @Override
  public Component getTableCellEditorComponent(JTable table, Object obj,
      boolean selected, int row, int col) {
      //SET TEXT TO BUTTON,SET CLICKED TO TRUE,THEN RETURN THE BTN OBJECT
     lbl=(obj==null) ? "":obj.toString();
     btn.setText(lbl);
     
        clicked=true;
    return btn;
  }
   
  //IF BUTTON CELL VALUE CHNAGES,IF CLICKED THAT IS
   @Override
  public Object getCellEditorValue() {
     if(clicked)
      {
     //   int selectedRow = table.getSelectedRow();
        //OrderItem orderItem = (OrderItem) EcoguardTable.getValueAt(selectedRow, 1);
       // String str = table.getValueAt(selectedRow, 8).toString();
      
//SHOW US SOME MESSAGE
          if(lbl.equalsIgnoreCase("AVAILABLE")){
              changescreen();
          }else{
              JOptionPane.showMessageDialog(null, "Sorry, No Suggestions has been sent to this order");
          }
          
      }
    //SET IT TO FALSE NOW THAT ITS CLICKED
    clicked=false;
    return new String(lbl);
  }
  
   @Override
  public boolean stopCellEditing() {
         //SET CLICKED TO FALSE FIRST
      clicked=false;
    return super.stopCellEditing();
  }
   
   @Override
  protected void fireEditingStopped() {
    // TODO Auto-generated method stub
    super.fireEditingStopped();
  }
}

    public void changescreen(){
        int selectedRow = EcoguardButtonTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to continue");
            return;
        }
        String eName = EcoguardButtonTable.getValueAt(selectedRow, 0).toString();
        OrderItem orderItem = (OrderItem) EcoguardButtonTable.getValueAt(selectedRow, 1);

        ManagerEcoguardlink panel = new ManagerEcoguardlink(userProcessContainer,system,dB4OUtil,orderItem,eName,enterprise);
        userProcessContainer.add("ManagerEcoguardlink", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        processBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        EcoguardButtonTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Manager DashBoard");
        add(jLabel1);
        jLabel1.setBounds(360, 40, 490, 90);

        processBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });
        add(processBtn);
        processBtn.setBounds(510, 660, 170, 40);

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        add(logoutBtn);
        logoutBtn.setBounds(1141, 730, 160, 29);

        EcoguardButtonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EnterpriseName", "OrderID", "ProductName", "ProductType", "Quantity", "TotalAmount", "Cord Required", "Date", "Status", "Supplier ID", "CLICK HERE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(EcoguardButtonTable);

        add(jScrollPane3);
        jScrollPane3.setBounds(20, 180, 1309, 402);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("EcoFriendly Website");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(110, 660, 330, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Manager/164616153-path-wallpapers.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1340, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = EcoguardButtonTable.getSelectedRow();
        String isOpen =  EcoguardButtonTable.getValueAt(selectedRow, 8).toString();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to continue");
            return;
        }
        if(isOpen.equalsIgnoreCase("Open")){
            OrderItem orderItem = (OrderItem) EcoguardButtonTable.getValueAt(selectedRow, 1);

            ManagerOrderProcess panel = new ManagerOrderProcess(userProcessContainer,system,dB4OUtil,orderItem,enterprise);
            userProcessContainer.add("ManagerOrderProcess", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "This Order is already Processed");
        }

        
        
    }//GEN-LAST:event_processBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        
        CardPanel cardPanel = new CardPanel(userProcessContainer, system, dB4OUtil);
        userProcessContainer.add("Login Screen", cardPanel);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);

        dB4OUtil.storeSystem(system);
        
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try {
    Desktop.getDesktop().browse(new URL("http://http://green-clique.appspot.com/").toURI());
    } 
     catch (Exception e) {}
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EcoguardButtonTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton processBtn;
    // End of variables declaration//GEN-END:variables
}
