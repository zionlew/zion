/**----------------------------------------------------------+
 +   PGM-ID  :   User.java
 +   Author  :   H.Liu
 +   Date    :   2015年5月4日 下午9:58:23
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.spring.learn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
    
    private String username;

    
    private Book book;
    
    
    public Book getBook() {
        return book;
    }

    @Autowired
    public void setBook(@Qualifier("book2") Book book) {
        this.book = book;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String printBook(){
        return "该用户的书名为: " + this.book.getName();
    }

}
