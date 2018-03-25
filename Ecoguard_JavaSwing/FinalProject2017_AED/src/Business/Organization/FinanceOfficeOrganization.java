/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.FinanceOfficeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dawn
 */
public class FinanceOfficeOrganization extends Organization{
    
    public FinanceOfficeOrganization() {
        super(Type.FinanceOffice.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinanceOfficeRole());
        return roles;
    }
}
