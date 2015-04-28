/**----------------------------------------------------------+
 +   PGM-ID  :   ChildClass01.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月28日 下午10:33:25
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.test.p01;

public class ChildClass01 extends FatherClass01{ 
    public synchronized void method() {
        System.out.println("Child Method");
    }
}
