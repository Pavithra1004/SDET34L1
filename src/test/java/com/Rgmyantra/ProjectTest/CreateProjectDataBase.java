package com.Rgmyantra.ProjectTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateProjectDataBase {
	public static void main(String[] args) throws SQLException {
		Connection connection=null; 
		
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement statement = connection.createStatement();
		 int result = statement.executeUpdate("insert into project values('Ty_004','poo','27/06/2022','kimai','on going',4);");
		if(result==1)
		{
			System.out.println("Data added sucessfully");
		}
		}
		finally {
		
		connection.close();
		System.out.println("close connection");

		}
	}

	}


