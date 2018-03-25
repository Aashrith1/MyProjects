/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Products.Product;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static javax.print.attribute.Size2DSyntax.MM;

/**
 *
 * @author Dawn
 */
public class Order {
   private ArrayList<OrderItem> orderItemList;
   private int ordernumber;
   private static int count=0;
  
   
   public Order()
   {
       count ++;
       ordernumber = count;
       orderItemList = new ArrayList<OrderItem>();
   }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }
   
    public OrderItem addOrderItem(int supplierID,int orderID,Product p, int q,String date,int wrkReqNumber) throws ParseException
    {
        Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(date);    
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date currdate = new Date();        
        String currentDate = dateFormat.format(currdate);
        Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(currentDate);
        
        OrderItem o = new OrderItem();        
        o.setSupplierID(supplierID);
        o.setOrderID(orderID);
        o.setProduct(p);
        o.getProduct().setQuantity(q);
//        o.getProduct().setCordUsed(p.getCordUsed());
//        o.getProduct().setProdID(p.getProdID());
//        o.getProduct().setProdName(p.getProdName());
//        o.getProduct().setProdPrice(p.getProdPrice());
//        o.getProduct().setProdType(p.getProdType());
//        o.getProduct().setQuantity(q);
//        o.getProduct().setRequestNumber(p.getRequestNumber());
        double price1 = (p.getProdPrice()*q);
        o.setSalesPrice(price1);
        double woodAmountFinal = p.getCordUsed()*q;
        o.setAmtOfWood(woodAmountFinal);
        o.setDateOfOrder(date1);
        if(date1.before(date2)){
            o.setOrderStatus("Completed");
        }else{
            o.setOrderStatus("Open");
        }
        o.setOrderForwrkReq(wrkReqNumber);
        orderItemList.add(o);
        return o;
    }
    
    public void removeOrderItem(OrderItem o)
    {
        orderItemList.remove(o);
    }
}
