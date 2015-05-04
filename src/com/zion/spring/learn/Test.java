/**----------------------------------------------------------+
 +   PGM-ID  :   Test.java
 +   Author  :   H.Liu
 +   Date    :   2015年5月4日 下午10:02:12
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.spring.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.getUsername());
        context.close();
    }
}
