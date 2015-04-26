/**----------------------------------------------------------+
 +   PGM-ID  :   BookService.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月26日 上午1:14:23
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.ssh.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("bookService")
public class BookService {
    
    private BookDao bookDao;  
    
    public void init() {
        System.out.println("init");
    }
    
    public void add(Book book) {
        bookDao.save(book);
    }
    public BookDao getBookDao() {
        return bookDao;
    }
    
    @Resource(name="book")
    public void setBookDao( BookDao bookDao) {
        this.bookDao = bookDao;
    }
  
    public void destroy() {
        System.out.println("destroy");
    }
}
