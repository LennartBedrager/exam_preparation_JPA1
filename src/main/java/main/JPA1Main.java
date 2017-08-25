
package main;

import enitity.Customer;
import enitity.FacadeImpl;
import enitity.OrderLine;
import enitity.Orders;
import java.util.ArrayList;
import java.util.List;

public class JPA1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FacadeImpl facade = new FacadeImpl();
        
        
        //Creating customer using the createCustomer method in FacadeImpl.
        Customer c = new Customer();
        c.setCustomerId(123232L);
        c.setCustomerEmail("email@email.dk");
        c.setCustomerName("James");
        facade.createCustomer(c);
        //The customer was succesfully created in the database.
        
        //Find customer by customer Id
        System.out.println(facade.findCustomer(123232L).getCustomerEmail());

        List<OrderLine> orderLine = new ArrayList();
        
        //Create single orders
        Orders o = new Orders();
        o.setCustomer(c);
        o.setOrderId(122222L);
        o.setOrderline(orderLine);
        
        
        
    }
    
}
