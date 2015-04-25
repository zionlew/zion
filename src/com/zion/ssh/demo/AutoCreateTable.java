/**----------------------------------------------------------+
 +   PGM-ID  :   AutoCreateTable.java
 +   Author  :   H.Liu
 +   Date    :   2015年4月25日 下午10:59:30
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.zion.ssh.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class AutoCreateTable {

    public static void main(String[] args){
        Configuration cfg = new Configuration().configure();
        SchemaExport schemaExport = new SchemaExport(cfg);
        schemaExport.create(true, true);
    }
    
}
