package com.ibm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.Line;

import com.ibm.servlet.util.DBConnection;
@WebServlet(name = "SapServlet", urlPatterns = { "/SapServlet" })
public class SapAddPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection ;
    /**
     * Default constructor. 
     */
    public SapAddPersonServlet() {
      super();
    }
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	connection = (Connection) config.getServletContext().getAttribute("db");
    	if (connection==null) {
    		System.out.println("INIT CONNECTION");
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try { 
			  
	          //  Connection con =(Connection)request.getSession().getAttribute("db");
	         
			if (connection==null) {
				System.out.println("TRUE");
			}
	           //  PreparedStatement st = con.prepareStatement("insert into person values(?,?,?,?,?,?,?,?)"); 
			 PreparedStatement st = connection.prepareStatement("insert into person values(?,?,?,?,?,?,?,?)"); 
	  
	             st.setInt(1, Integer.valueOf(request.getParameter("id"))); 
	            st.setString(2, request.getParameter("name")); 
	            st.setString(3, request.getParameter("address")); 
	            st.setInt(4, Integer.valueOf(request.getParameter("age"))); 
	            st.setDouble(5, Double.valueOf(request.getParameter("income"))); 
	            st.setString(6, request.getParameter("occupation")); 
	            st.setString(7, request.getParameter("note")); 
	            st.setString(8, request.getParameter("status")); 
	  
	            st.executeUpdate(); 
	  
	            
	            st.close(); 
	            connection.close(); 
	  
	           
	            response.sendRedirect("beanData.jsp");
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
	   } 
	}
