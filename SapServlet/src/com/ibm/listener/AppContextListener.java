package com.ibm.listener;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.ibm.servlet.util.DBConnection;


public class AppContextListener implements ServletContextListener{
	
	
	public void contextInitialized(ServletContextEvent servletContextEvent) {
	    	ServletContext ctx = servletContextEvent.getServletContext();
	    	
	    	String url = ctx.getInitParameter("DBURL");
	    	String u = ctx.getInitParameter("DBUSER");
	    	String p = ctx.getInitParameter("DBPWD");
	    	
	    	try {
				DBConnection db = new DBConnection(url, u, p);
				Connection con = db.getConnection();
				ctx.setAttribute("db", con);
				System.out.println("DBConnection" + ctx.getAttribute("db"));
				if (con==null) {
		    		System.out.println("APPCONTEXTLISTENER CONNECTION");
		    	}
	    	} catch (SQLException e) {
				
				e.printStackTrace();
			}
	    	
	  }
	    	
	  public void contextDestroyed(ServletContextEvent servletContextEvent) {
	    	ServletContext ctx = servletContextEvent.getServletContext();
	    	DBConnection dbManager = (DBConnection) ctx.getAttribute("db");
	    	dbManager.closeConnection();
	    	System.out.println("Database connection closed for Application.");
	    	
	    }
		
}
