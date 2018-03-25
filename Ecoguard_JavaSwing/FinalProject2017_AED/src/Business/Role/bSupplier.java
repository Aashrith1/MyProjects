/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.bSupplier.bSupplierWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Aashrith
 */
public class bSupplier extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new bSupplierWorkArea(userProcessContainer,account,enterprise,business,dB4OUtil,organization);
    
    }
    
    
}
