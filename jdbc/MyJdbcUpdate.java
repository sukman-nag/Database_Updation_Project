package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyJdbcUpdate {
	public static void main(String[] args) throws Exception {
		//Yaha par hum data Update kar rahe hai jisme jaha bhi city naam markel hoga waha name update hakar Krishna ho jayega...
		String name = "Krishna";
		String city = "markle";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbs_db","root","@suk99");
		
		 PreparedStatement ps = con.prepareStatement("update resister set name=? where city=?");
		 ps.setString(1, name);
		 ps.setString(2, city);
		 
		int count = ps.executeUpdate();
		 if(count >0) {
			 System.out.println("Updation successfully");
		 }
		 else {
			 System.out.println("Updation failed!!");
		 }
		 
		 
	}
}

