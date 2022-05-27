package com.PracticeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Sdet32l1.GenricScript.FileMethods;
import com.Sdet32l1.GenricScript.IConstantsPath;
import com.Sdet32l1.GenricScript.JavaMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
// craete cantact properties
public class CreateContactProperties {
public static void main(String[] args) throws IOException {
	//JavaMethods jm=new JavaMethods();
	FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
	String url=FileMethods.getDataFromPropertyFile("url");
	String un=FileMethods.getDataFromPropertyFile("un");
	String pwd=FileMethods.getDataFromPropertyFile("pwd");
	String browser=FileMethods.getDataFromPropertyFile("browser");
	String timeout=FileMethods.getDataFromPropertyFile("timeout");

	long longTimeOut=JavaMethods.stringToLong(timeout);
	//int randnumber=jm.getRandomNumber(1000);
	WebDriver driver=null;
	switch (browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;

	default: {
		System.out.println("please specify the browser");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
		break;
	}
	
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(longTimeOut, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[.='Contacts']")).click();
	driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	String Firstname="Sdet1010";
	String Lastname="BS";
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Firstname);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lastname);
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
