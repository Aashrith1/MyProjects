/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Products.ProductDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private ProductDirectory productDirectory;
    private static int counter;

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }
    
    public enum Type
    {
        Admin("Admin Organization"),
        Designer("Designer Organization"),
        provider("Provider Organization"),
        Ecoguard("Ecoguard Organization"),
        Supplier("Supplier Organization"),
        Manager("Manager Organization"),
        HR("HR Organization"),
        Realtor("Realtor Organization"),
        FinanceOffice("Finance Office Organization"),
        BudgetAllocation("Budget Allocation Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name)
    {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        productDirectory = new ProductDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() 
    {
        if(name == null)return "no name";
                else
            return name;
    }
    
    
}
