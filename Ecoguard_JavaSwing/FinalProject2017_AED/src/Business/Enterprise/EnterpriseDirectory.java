/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        if (type == Enterprise.EnterpriseType.Banking){
            enterprise = new BankingEnterprise(name) ;
            enterprise.setContribution(0);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Corporate)
        {
            enterprise = new CorporateEnterprise(name);
            enterprise.setContribution(0);
            enterpriseList.add(enterprise);
        }
       
        else if(type == Enterprise.EnterpriseType.Education)
        {
          //  enterprise.setName(name);
            enterprise = new EducationEnterprise(name);
            enterprise.setContribution(0);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Housing)
        {
            enterprise = new HousingEnterprise(name);
            enterprise.setContribution(0);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
