/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Products.Product;
import java.util.Date;

/**
 *
 * @author Dawn
 */
public class OrderItem {
    
    private int SupplierID;
    private int orderID;
    private double salesPrice;
    private Product product;
    private double amtOfWood;
    private Date dateOfOrder;
    private String orderStatus;
    private int orderForwrkReq;
    private String finalStatus;

        public OrderItem()
        {
            product = new Product();
        }
    
    public String getFinalStatus() {
        return finalStatus;
    }

    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }
    
    

    public int getOrderForwrkReq() {
        return orderForwrkReq;
    }

    public void setOrderForwrkReq(int orderForwrkReq) {
        this.orderForwrkReq = orderForwrkReq;
    }
   
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    
    
    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int SupplierID) {
        this.SupplierID = SupplierID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
    public double getAmtOfWood() {
        return amtOfWood;
    }
    public void setAmtOfWood(double amtOfWood) {
        this.amtOfWood = amtOfWood;
    }
    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    @Override
    public String toString()
    {
        //return (String)
        return product.getProdName();
    }
}
