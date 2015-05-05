/**----------------------------------------------------------+
 +   PGM-ID  :   User.java
 +   Author  :   H.Liu
 +   Date    :   2015年5月4日 下午9:58:23
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.spring.learn;

public class User {
    
    private String username;

    
    private Book book;
      
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
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
