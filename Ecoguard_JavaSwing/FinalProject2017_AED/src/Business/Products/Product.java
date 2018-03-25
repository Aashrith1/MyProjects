/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

/**
 *
 * @author Aashrith
 */
public class Product {

    private String prodName;
    private String prodID;
    private int prodPrice;
    private int cordUsed;
    private String prodType;
    int requestNumber = 0;
    static int count = 0;
    private int Quantity;

    public int getCordUsed() {
        return cordUsed;
    }

    public void setCordUsed(int cordUsed) {
        this.cordUsed = cordUsed;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Product() {
        requestNumber = count++;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String toString() {
        return this.prodName;
    }

}
