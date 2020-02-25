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
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(String customerName,long customerPhoneNumber, String customerEmail,String flightNumber, String seatNumber){
        Customer customer= new Customer(customerName, customerPhoneNumber, customerEmail, flightNumber, seatNumber);
        customerList.add(customer);
        return customer;
        
    }
    
    public void deleteCustomer(Customer customer){
        customerList.remove(customer);
    }
    
}
