/**----------------------------------------------------------+
 +   PGM-ID  :   Person.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月24日 下午9:53:25
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.ssh.demo;


public class Person {
    private int id;
    private String name;
    private int age;
    private Book book;
    
    public Person(){
        System.out.println("Person对象产生");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("Person中的setName方法");
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        System.out.println("Person中SetBook方法");
        this.book = book;
    }
    
}
