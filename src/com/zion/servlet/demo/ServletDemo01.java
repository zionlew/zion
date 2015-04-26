/**----------------------------------------------------------+
 +   PGM-ID  :   ServletDemo01.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月26日 下午10:34:37
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet {

    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        PrintWriter out = resp.getWriter();
        out.write("ServletDemo01访问成功");
        
    }

}
