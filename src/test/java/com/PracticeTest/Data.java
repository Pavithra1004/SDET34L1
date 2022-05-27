package com.PracticeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Data {

	public static void main(String[] args) throws SQLException {
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection connection = DriverManager.getConnection(null, null, null);
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from emp");
		while(result.next())
		{
			System.out.println(result.getString(1));
		}
	}
}
