/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author KnaldeKalle
 */
@Entity
public class OrderLine implements Serializable {

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Orders o;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int quantity;
    
    @OneToOne
    private ItemType itemtype;

    public Orders getO() {
        return o;
    }

    public void setO(Orders o) {
        this.o = o;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ItemType getItemtype() {
        return itemtype;
    }

    public void setItemtype(ItemType itemtype) {
        this.itemtype = itemtype;
    }
 
    
}
