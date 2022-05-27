package com.Rgmyantra.ProjectTest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.Sdet32l1.GenricScript.DataBaseMethods;
import com.Sdet32l1.GenricScript.FileMethods;
import com.Sdet32l1.GenricScript.IConstantsPath;
import com.Sdet32l1.GenricScript.JavaMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProjectTest {
	public static void main(String[] args) throws SQLException, IOException {
		JavaMethods jm=new JavaMethods();
   FileMethods.openPropertyFile(IConstantsPath.RMG_PROPERTYFILEPATH);
   String rmgusername=FileMethods.getDataFromPropertyFile("rmgusername");
   String rmgpassword=FileMethods.getDataFromPropertyFile("rmgpassword");
   String rmgurl=FileMethods.getDataFromPropertyFile("rmgurl");
   String databaseName=FileMethods.getDataFromPropertyFile("databaseName");
   String dbpwd=FileMethods.getDataFromPropertyFile("dbpwd");
   String dbun=FileMethods.getDataFromPropertyFile("dbun");
   String projectname="MRP"+jm.getRandomNumber(1000);
System.out.println(projectname);
DataBaseMethods.openDBConnection(IConstantsPath.RMGYANTRA_DATABASE_URL, dbun, dbpwd);
DataBaseMethods.setDataIntoDataBase("insert into project values('Ty_00298','abc','09/05/2022','"+projectname+"','on going',4);");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get(rmgurl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("usernmae")).sendKeys(rmgusername);
		driver.findElement(By.id("inputPassword")).sendKeys(rmgpassword);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(projectname);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
	    //js.executeScript("document.getElementByName('teamSize').value='4'");
		driver.findElement(By.name("createdBy")).sendKeys("Srinivas");
		WebElement selectDropdown = driver.findElement(By.xpath("//label[.='Project Status ']/following-sibling::select"));
		Select s=new Select(selectDropdown);
		s.selectByVisibleText("Created");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		DataBaseMethods.closeDBConnection();
		
		/*Connection connection=null; 
		try {
			Driver driver1=new Driver();
			DriverManager.registerDriver(driver1);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from project");
			while(result.next())
			{
				if(result.getString("project_name").equalsIgnoreCase(Projectname))
				{
					System.out.println("Project name is present in database");
					System.out.println("TC pass");
				}
			}

		}
			finally {
				connection.close();
				driver.quit();
				System.out.println("close connection");

			}
		*/
	}
	

	}



