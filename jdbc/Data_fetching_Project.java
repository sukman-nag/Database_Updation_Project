package com.database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Data_fetching_Project {
	public static void main(String[] args) throws Exception {
		Data_fetching_Project var = new Data_fetching_Project();
		var.FetchingData();
	}
	
	 public void FetchingData()throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","@suk99");
		
		PreparedStatement ps = con.prepareStatement("select * from register");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("Name "+ rs.getString("name"));
			System.out.println("Email "+ rs.getString("email"));
			System.out.println("Password "+ rs.getString("password"));
			System.out.println("Gender "+ rs.getString("gender"));
			System.out.println("Place "+ rs.getString("place"));
			System.out.println("-----------------------------------------------------------");
		}
		con.close();
		
	}
	
	

}









