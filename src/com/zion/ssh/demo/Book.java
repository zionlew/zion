/**----------------------------------------------------------+
 +   PGM-ID  :   Book.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月24日 下午9:53:58
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.ssh.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private double price;
    
    public Book(){
        System.out.println("Book 对象产生");
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("执行Book的SetName方法");
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
