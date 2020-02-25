/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Krish
 */
public class Customer {
    
    private String customerName;
    private long  customerPhoneNumber;
    private String customerEmail;
    private String flightNumber;
    private String seatNumber;
    private ArrayList<AirlinerDirectory> airlinerDirectory;
    public Customer(String customerName, long customerPhoneNumber, String customerEmail, String flightNumber, String seatNumber) {
        this.customerName=customerName;
        this.customerPhoneNumber=customerPhoneNumber;
        this.customerEmail=customerEmail;
        this.flightNumber=flightNumber;
        this.seatNumber=seatNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public ArrayList<AirlinerDirectory> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<AirlinerDirectory> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    
    
    
    @Override
    public String toString(){
        return customerName;
    }
    
}
