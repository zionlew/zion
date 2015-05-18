/**----------------------------------------------------------+
 +   PGM-ID  :   Book.java
 +   Author  :   H.Liu
 +   Date    :   2015年5月4日 下午10:08:07
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.spring.learn;

import org.springframework.stereotype.Component;

@Component("book")
public class Book {
    
    private String name = "Java";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
