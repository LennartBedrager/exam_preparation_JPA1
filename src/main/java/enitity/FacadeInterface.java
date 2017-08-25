
package enitity;

import java.util.List;


public interface FacadeInterface {
   
    public void createCustomer(Customer c);
    
    public Customer findCustomer(Long customerId);
    
    public List<Customer> getAllCustomer();
    
    public void createOrder(Orders o);
    
    public void addOrderToCustomer();
    
    public Orders findOrder();
    
    
}
