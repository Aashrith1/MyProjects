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
import static java.time.Clock.system;
import javax.swing.JPanel;
import Business.Designer.DesignerWorkAreaJPanel;

/**
 *
 * @author Aashrith
 */
public class DesignerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new DesignerWorkAreaJPanel(userProcessContainer,account,dB4OUtil,enterprise,business,organization);
    }

    
    
}
