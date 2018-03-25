/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Products.ProductDirectory;

/**
 *
 * @author Aashrith
 */
public class Supplier {
    
    private String supplierName;
    private int supplierID;
    //private static int count = 0;
    ProductDirectory productDirectory;
    String SupplierRating;

    public String getSupplierRating() {
        return SupplierRating;
    }

    public void setSupplierRating(String SupplierRating) {
        this.SupplierRating = SupplierRating;
    }
    
    
    public Supplier()
    {
        productDirectory = new ProductDirectory();
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }
    
    

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }
    
    public String toString()
    {
        String ID = String.valueOf(supplierID);
        return ID;
        
    }
    
    
}
