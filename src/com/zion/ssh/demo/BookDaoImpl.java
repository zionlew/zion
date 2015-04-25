/**----------------------------------------------------------+
 +   PGM-ID  :   BookDao.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月25日 下午11:04:44
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.ssh.demo;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component("book") 
public class BookDaoImpl implements BookDao{
    
    public BookDaoImpl(){
        System.out.println("BookDaoImpl");
    }
    
    private SessionFactory sessionFactory;
    
    public SessionFactory getSessionFactory() {
        
        return sessionFactory;
    }
    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        System.out.println("set");
        this.sessionFactory = sessionFactory;
    }

    public void save(Book book){
        System.out.println("ss" + sessionFactory);
        Session s =  sessionFactory.openSession();
        s.beginTransaction();
        s.save(book);
        s.getTransaction().commit();
        System.out.println("ok");
    }
}
