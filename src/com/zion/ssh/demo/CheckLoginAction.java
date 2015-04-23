/**----------------------------------------------------------+
 +   PGM-ID  :   HelloWorld.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月23日 下午9:48:23
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.ssh.demo;

import com.opensymphony.xwork2.ActionSupport;

public class CheckLoginAction extends ActionSupport {

    private String username;
    private String password;

    @Override
    public String execute() throws Exception {

        System.out.println("username:[" + username + "]");
        System.out.println("password:[" + password + "]");

        
        // 用户名和密码同时为空,跳到错误页
        if (username.equals("") && password.equals("") ) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passowrd) {
        this.password = passowrd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
