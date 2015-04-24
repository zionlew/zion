/**----------------------------------------------------------+
 +   PGM-ID  :   TestSpring.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月24日 下午9:51:20
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.ssh.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    
    public void testBook(){

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        Book book = context.getBean("book",Book.class);
        System.out.println(book.getName());
        ((ClassPathXmlApplicationContext) context).close();
    }
    
    @Test
    public void testPerson(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        Person person = context.getBean("person",Person.class);
        System.out.println(person.getName());
        System.out.println(person.getBook().getName());
        ((ClassPathXmlApplicationContext) context).close();
    }

}
