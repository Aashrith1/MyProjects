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
import Business.Provider.ProviderWorkAreaPanel;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Aashrith
 */
public class ProviderRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, DB4OUtil dB4OUtil) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new ProviderWorkAreaPanel(userProcessContainer,dB4OUtil,enterprise,account,system);
            
    }
    
}
