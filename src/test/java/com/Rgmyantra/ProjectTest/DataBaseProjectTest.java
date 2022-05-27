package com.Rgmyantra.ProjectTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseProjectTest {
	
	public static void main(String[] args) throws SQLException {
		Connection connection=null; 
		
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from project");
		while(result.next())
		{
			System.out.println(result.getString("project_id"));
		}
		}
		finally {
		connection.close();
		System.out.println("close connection");

		}
	}

	}


