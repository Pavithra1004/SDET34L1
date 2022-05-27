package com.PracticeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactTestByDatabase {
	public static void main(String[] args) throws SQLException, InterruptedException {

		String url=null,uname=null,password=null,timeout=null,Browsername=null;
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vtiger", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from vtiger;");
		while(result.next())
		{
			url=result.getString("url");
			uname=result.getString("uname");
			password=result.getString("password");
			timeout=result.getString("timeout");
			Browsername=result.getString("Browsername");

		}
		long longTimeOut=Long.parseLong(timeout);
		WebDriver driver=null;
		switch (Browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		default:System.out.println("please specify the browser");
			break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(longTimeOut, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		String Firstname="Sdet1010";
		String Lastname="BS";
		driver.findElement(By.name("Firstname")).sendKeys(Firstname);
		driver.findElement(By.name("Lastname")).sendKeys(Lastname);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
		
		WebElement ActualFirstname = driver.findElement(By.id("dtlview_First Name"));
		WebElement ActualLastname = driver.findElement(By.id("dtlview_last Name"));
		
		if(ActualFirstname.getText().equalsIgnoreCase(Firstname)&&ActualLastname.getText().equalsIgnoreCase(Lastname))
		{
			System.out.println("contact sucessfully created");
			System.out.println("TC pass");
		}
		


	}
}
