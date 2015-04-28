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
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

public class ServletDemo01 extends HttpServlet {

    private PrintWriter out ;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        
        //获得输出流
        out = response.getWriter();      

        String name = request.getParameter("name");
        out.write("<h2>ServletDemo01<h2>");
        out.write("Hello," + name + "<br>");
        
        
        /**获取参数
         * 1.获取context-param中的参数
         * 2.获取init-param中的参数
         * 3.获取页面传递过来的参数
         */
        ssout("1.获取context-param中的参数");
        ssout(this.getServletContext().getInitParameter("character"));
        ssout("2.获取init-param中的参数");
        ssout(this.getServletConfig().getInitParameter("name"));       
        ssout("3.获取页面传递过来的参数");
        ssout(request.getParameter("name"));
        
        //获得Cookie
        Cookie[] cookies = request.getCookies();
        out.println("Cookies:<br>");
        if (cookies!=null) {
        for (Cookie cookie : cookies) {
            out.println(cookie.getValue());
        }}
        

        /**
         * Servlet九大内置对象
         * 1.输入输出对象  request,response,out
         * 2.通信控制对象 pageContext,session,application
         * 3.Servlet对象 page,config
         * 4.错误处理对象 exception
         */
        //获得PageContext
        //此变量代表上下文,可获得各种范围内的变量
        PageContext pageContext = JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
        
        ssout("pageContext:" + pageContext);
        
        ssout("通过pageContext取得Session");
        ssout("ssion" + pageContext.getSession());
        ssout("通过Request取得Session");
        HttpSession session = request.getSession();
        ssout("session:" + session);
        
        ssout("Session的创建时间");
        ssout(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date(session.getCreationTime())));
        
        out.close();
    }
    
    public void ssout(String str) {
        out.println(str + "<br>");
    }

}
