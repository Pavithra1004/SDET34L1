package com.Rgmyantra.ProjectTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateNameInGUIDatabase {
	public static void main(String[] args) throws SQLException {
		WebDriver driver1=null;
		String projectname="SDET115";
		
		Connection connection=null; 
		
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement statement = connection.createStatement();
		 int result = statement.executeUpdate("insert into project values('Ty_0013','abc','27/06/2022','"+projectname+"','on going',4);");
		if(result==1)
		{
			System.out.println("Data added sucessfully");
		}
		}
		finally {
		
		connection.close();
		System.out.println("close connection");

		}
		try {
		WebDriverManager.firefoxdriver().setup();
		 driver1=new FirefoxDriver();
		driver1.get("http://localhost:8084");
		driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver1.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver1.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver1.findElement(By.xpath("//button[.='Sign in']")).click();
		driver1.findElement(By.xpath("//a[.='Projects']")).click();
		 List<WebElement> listofprojects = driver1.findElements(By.xpath("//table//tbody/tr[1]/td[2]"));
		 for( WebElement project : listofprojects)
		 {
			 if(project.getText().equalsIgnoreCase(projectname))
			 {
				 System.out.println("Project name is present in GUI");
					System.out.println("TC pass");
					break;
					
			 }
		 }
	}
finally {
	driver1.close();
	
}
}
}
