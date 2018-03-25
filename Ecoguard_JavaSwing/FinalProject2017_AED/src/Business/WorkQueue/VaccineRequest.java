/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Aashrith
 */
public class VaccineRequest extends WorkRequest {
    
    private String vaccineName;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private UserAccount sender1;
    private UserAccount receiver1;
    private String requestType;
    private String quantity;

    public UserAccount getSender1() {
        return sender1;
    }

    public void setSender1(UserAccount sender1) {
        this.sender1 = sender1;
    }

    public UserAccount getReceiver1() {
        return receiver1;
    }

    public void setReceiver1(UserAccount receiver1) {
        this.receiver1 = receiver1;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    
    
    
}
