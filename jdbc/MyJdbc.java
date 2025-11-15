package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyJdbc {
	public static void main(String[] args) throws Exception{
		// Jab hume values ko Strings ke form me store karna hai tab
		String name1 = "Sukman";
		String email = "nagsukman.com";
		String pass = "@suk1999"; 
		String gender = "male";
		String city = "Jagdalpuyr";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// userName MYSQL = userName, userPassword //[ userName = root, userPassword = @suk99 ] 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbs_db","root","@suk99");
		
		// yaha se query dalna hoga:
		// PreparedStatement ps = con.prepareStatement("insert into register value(?,?,?,?,?");
		// PreparedStatement ps = con.prepareStatement("insert into register value('"+name1+"','"+email+"','"+pass+"','"+gender+"','"+city+"')");
//		 PreparedStatement ps2 = con.prepareStatement("insert into register value('ramprasad','ramprasad@13gmai.com','@raam9','male','Jagdalpur2')");
//	 	PreparedStatement ps3 = con.prepareStatement("insert into register value('gagan','gaganbaghel@13gmai.com','@baghel99','male','Jagdalpur3')");

		 // name , email , password , gender , city name:
//		   int i = ps1.executeUpdate();
//		   int j = ps2.executeUpdate();
//		   int k = ps3.executeUpdate();
		 
		 
		 PreparedStatement ps = con.prepareStatement("insert into resister value(?,?,?,?,?)");
	 		ps.setString(1,name1);
	 		ps.setString(2, email);
	 		ps.setString(3, pass);
	 		ps.setString(4, gender);
	 		ps.setString(5, city);
	 		
	 		int i = ps.executeUpdate();
		   if(i > 0) {
			   System.out.println("stored Successfull");
		   }
		   else {
			   System.out.println("failed !!");
		   }
	}
}

