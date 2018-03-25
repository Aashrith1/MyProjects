
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.Order;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author raunak
 */
public abstract class Enterprise extends Organization{
    
    
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Order order;
    private double contribution;

    public double getContribution() {
        return contribution;
    }

    public void setContribution(double contribution) {
        this.contribution = contribution;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
    public Enterprise(String name, EnterpriseType type)
    {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        order = new Order();
    }
    
    public enum EnterpriseType{
        Banking("Banking"),Corporate("Corporate"),Education("Education"),Housing("Housing");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public EnterpriseType getEnterpriseType()
    {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
