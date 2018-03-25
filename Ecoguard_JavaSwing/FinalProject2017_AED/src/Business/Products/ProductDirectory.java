/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

import java.util.ArrayList;

/**
 *
 * @author Aashrith
 */
public class ProductDirectory {
    
    private ArrayList<Product> productList;
    
    public ProductDirectory()
    {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct()
    {
        Product product = new Product();
        productList.add(product);
        return product;
    }
    
}
