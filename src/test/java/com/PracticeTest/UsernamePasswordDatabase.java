package com.PracticeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UsernamePasswordDatabase {
	public static void main(String[] args) throws SQLException {
		Connection connection=null; 
		
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pavithra", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from pavithra;");
		while(result.next())
		{
			System.out.println(result.getString("Password")+"   "+result.getString("Username")+"   "+result.getString("Url"));
		}
		}
		finally {
		connection.close();
		System.out.println("close connection");

		}
	}

}
