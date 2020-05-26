package com.ibm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.servlet.util.Person;

/**
 * Servlet implementation class BeanInServlet
 */
@WebServlet("/BeanInServlet")
public class BeanInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeanInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Person p = new Person();
		p.setId( Integer.valueOf(request.getParameter("id")));
		 p.setFullname( request.getParameter("name")); 
         p.setAddress( request.getParameter("address")); 
         p.setAge( Integer.valueOf(request.getParameter("age"))); 
         p.setIncome( Double.valueOf(request.getParameter("income"))); 
         p.setWork( request.getParameter("occupation")); 
         p.setNote( request.getParameter("note")); 
         p.setStatus( request.getParameter("status")); 
		
		request.getSession().setAttribute("person", p);
		RequestDispatcher rd = request.getRequestDispatcher("/beanData.jsp");
		rd.forward(request, response);
		
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	

	}

}
