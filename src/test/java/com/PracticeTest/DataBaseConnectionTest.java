package com.PracticeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseConnectionTest {
public static void main(String[] args) throws SQLException {
	Connection connection=null; 
	try {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet", "root", "root");
	Statement statement = connection.createStatement();
	ResultSet result = statement.executeQuery("select * from sdet;");
	while(result.next())
	{
		System.out.println(result.getString("empname"));
	}
	}
	finally {
	connection.close();
	System.out.println("");
	}
}

}
