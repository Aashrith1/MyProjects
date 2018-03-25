/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.RealtorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dawn
 */
public class RealtorOrganization extends Organization{
    
    public RealtorOrganization() {
        super(Type.Realtor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RealtorRole());
        return roles;
    }
}
