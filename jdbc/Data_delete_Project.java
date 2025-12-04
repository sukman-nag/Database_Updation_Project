package com.database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class Data_delete_Project {
	public static void main(String[] args) throws Exception {

		String name = "Ramprashad";
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "@suk99");
		PreparedStatement ps = con.prepareStatement("delete from register where name=?");

		ps.setString(1, name);
		int out = ps.executeUpdate();
		
		if(out > 0) {
			System.out.println("Deletion successful");
			
		}
		else {
			System.out.println("Deletion failed");
		}

	}

}
