/**----------------------------------------------------------+
 +   PGM-ID  :   Test.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月28日 下午11:05:36
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put( "dd", "hello");
        System.out.println(map.get("dd"));
    }

}
