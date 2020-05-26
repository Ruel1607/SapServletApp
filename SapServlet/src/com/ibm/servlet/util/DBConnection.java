package com.ibm.servlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private Connection connection;
	
	public DBConnection(String url,String user, String password) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(url,user,password);
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
				
			}		
	}
	
	
	public Connection getConnection(){
		return this.connection;
	}

	/*
	 * public ResultSet runSql(String sql) throws SQLException{ Statement sta =
	 * connection.createStatement(); return sta.executeQuery(sql); }
	 */
	public void closeConnection(){
		//close DB connection here
	}
}