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

    
    //在配置文件中给属性赋值,在这里不写Setter,Getter方法
    private Book book;
    public User(Book book){
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
