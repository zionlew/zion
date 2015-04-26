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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //接收参数
        String name = request.getParameter("name");
  
        //获得输出流
        PrintWriter out = response.getWriter();
        out.write("<h1>ServletDemo01<h2>");
        out.write("Hello," + name + "<br>");
        
        //获得Cookie
        Cookie[] cookies = request.getCookies();
        out.println("Cookies:<br>");
        for (Cookie cookie : cookies) {
            out.println(cookie.getValue());
        }
        
        out.close();
    }

}
