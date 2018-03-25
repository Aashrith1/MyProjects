/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type)
    {
        Organization organization = null;
        
        if (type.getValue().equals(Type.Designer.getValue()))
        {
            organization = new DesignerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.provider.getValue()))
        {
            organization = new ProviderOrganization();
                    
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(type.Ecoguard.getValue()))
        {
            organization = new EcoguardOrganization();
                    
            organizationList.add(organization);
        }
        
                
        else if(type.getValue().equals(type.Supplier.getValue()))
        {
            organization = new SupplierOrganization();
                    
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(type.HR.getValue()))
        {
            organization = new HROrganization();
                    
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(type.Realtor.getValue()))
        {
            organization = new RealtorOrganization();
                    
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(type.FinanceOffice.getValue()))
        {
            organization = new FinanceOfficeOrganization();
                    
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(type.BudgetAllocation.getValue()))
        {
            organization = new BudgetAllocationOrganization();
                    
            organizationList.add(organization);
        }
        
          else if(type.getValue().equals(type.Manager.getValue()))
        {
            organization = new ManagerOrganization();
                    
            organizationList.add(organization);
        }
        
        
        
        
     
        return organization;
    }
}