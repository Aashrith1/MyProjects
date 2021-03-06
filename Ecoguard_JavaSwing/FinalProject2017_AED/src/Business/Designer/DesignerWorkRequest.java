/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Designer;

import Business.WorkQueue.ProvoiderRequest;
import Business.WorkQueue.ProvoiderRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DesignerWorkRequest extends javax.swing.JPanel {

    JPanel userProcessContainer;
    ProvoiderRequest request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public DesignerWorkRequest(JPanel userProcessContainer, ProvoiderRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        fullscreen();
    }
    
    public void fullscreen(){
       int width = Toolkit.getDefaultToolkit().getScreenSize().width;
       int heigth = Toolkit.getDefaultToolkit().getScreenSize().height;
       jLabel1.setSize(width, heigth);
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(null);

        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitJButton.setText("Approve");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(180, 170, 107, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1);
        jLabel1.setBounds(200, 70, 57, 22);
        add(resultJTextField);
        resultJTextField.setBounds(270, 70, 177, 30);

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(10, 310, 100, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Reject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(330, 170, 100, 31);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Designer/wallpaper-extremly-red-leaves-autumn-1920-x-1080-full-hd.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 540, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DesignerWorkAreaJPanel dwjp = (DesignerWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.setFinalprod(resultJTextField.getText());
        request.setStatus("Completed");
        
        JOptionPane.showMessageDialog(null,"Request Successfully Approved");
        
        //Send to ecoguard
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        request.setFinalprod(resultJTextField.getText());
        request.setStatus("Rejected");
        JOptionPane.showMessageDialog(null,"Request Rejected");
        //cannot be sent to ecoguard
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
