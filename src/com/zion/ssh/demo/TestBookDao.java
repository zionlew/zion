/**----------------------------------------------------------+
 +   PGM-ID  :   TestBookDao.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月25日 下午11:26:55
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.ssh.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookDao {

    @Test
    public void testAdd() {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        BookService dao = context.getBean("bookService",BookService.class);
        Book book = new Book();
        book.setName("java");
        book.setPrice(20l);
        System.out.println("dao:" + dao);
        dao.add(book);

    }
}
