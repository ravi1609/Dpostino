package com.dpostino.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionProviderUtility {

	
	private static Connection connection = null;

    public static Connection getConnection() throws Exception {
    	   connection = null; 
    	   if (connection != null)
                    return connection;
            else {
                    // Store the database URL in a string
              /*   
            	String serverName = "mdsys.cgcpjtwxxtgu.ap-southeast-1.rds.amazonaws.com";
                    String portNumber = "1521";
                    String sid = "ORCL";
                    */
                    // for local system
           	String serverName = "localhost";
                 String portNumber = "1521";
                 String sid = "xe";
            	
              
            	String dbUrl = "jdbc:oracle:thin:@" + serverName + ":" + portNumber
                                    + ":" + sid;
                    Class.forName("oracle.jdbc.driver.OracleDriver");

                    // set the url, username and password for the databse
                    connection = DriverManager.getConnection(dbUrl, "SGDCDBTEST", "test#56#Kut");
                    return connection;
            }
    }
	
}
