/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author KnaldeKalle
 */
public class FacadeImpl implements FacadeInterface{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_Exam-Preparation_JPA1_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
    
    
    @Override
    public void createCustomer(Customer c) {
        
       em.getTransaction().begin();
       em.persist(c);
       em.getTransaction().commit();
        
        
    }

    @Override
    public Customer findCustomer(Long customerId) {
       
        Query q = em.createNamedQuery("Customer.findById");
        q.setParameter("id",customerId);
        Customer c = (Customer) q.getSingleResult();
        return c;
    }

    @Override
    public List<Customer> getAllCustomer() {
        Query q = em.createQuery("select c from Customer c");
        List<Customer> customers = q.getResultList();
        return customers;
    }

    @Override
    public void createOrder(Orders o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
    }

    @Override
    public void addOrderToCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Orders findOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
