/**----------------------------------------------------------+
 +   PGM-ID  :   UserDao.java
 +   Author  :   H.Liu
 +   Date    :   2015年5月5日 下午8:21:16
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.spring.learn;

import java.util.List;

public class UserDao {

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    public void printList(){
        for(String s: list){
            System.out.println(s);
        }
    }
}
