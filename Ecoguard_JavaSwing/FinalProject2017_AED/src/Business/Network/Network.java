/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Supplier.SupplierDirectory;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Network{
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private SupplierDirectory supplierDirectory;

    public Network()
    {
        enterpriseDirectory = new EnterpriseDirectory();
        supplierDirectory = new SupplierDirectory();
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

   
}
