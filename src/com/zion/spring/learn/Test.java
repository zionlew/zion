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
        Book book1 = context.getBean("book",Book.class);
        Book book2 = context.getBean("book",Book.class);
        //当scope属性配置为Singleton时,查看两次获得的对象址是否一致
        //当scope属性配置为Prototype时,查看两次获得的对象址是否一致        
        System.out.println(book1);
        System.out.println(book2);
        context.close();
    }
}
