package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        customer.setID(28);
        customer.setIsNew(false);
        customer.setTotal(699.2F);
        customer.displayCustomerInfo();
    }
}
