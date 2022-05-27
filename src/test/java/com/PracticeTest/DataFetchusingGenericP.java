package com.PracticeTest;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.Sdet32l1.GenricScript.FileMethods;
import com.Sdet32l1.GenricScript.IConstantsPath;
import com.Sdet32l1.GenricScript.JavaMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataFetchusingGenericP {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	JavaMethods jm=new JavaMethods();
	FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
	String url=FileMethods.getDataFromPropertyFile("url");
	String un=FileMethods.getDataFromPropertyFile("un");
	String pwd=FileMethods.getDataFromPropertyFile("pwd");
	String browser=FileMethods.getDataFromPropertyFile("browser");
	String timeout=FileMethods.getDataFromPropertyFile("timeout");

	long longTimeOut=JavaMethods.stringToLong(timeout);
	int randnumber=jm.getRandomNumber(1000);
	
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	System.out.println(browser);
	System.out.println(longTimeOut);
	System.out.println(randnumber);
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
	WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[@name='Campaigns']")).click();
	driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
	Random rand=new Random();
	int randnum = rand.nextInt(1000);
	String Campaignsname="impulse"+randnum;
	driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(Campaignsname);
	WebElement ele1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Thread.sleep(2000);
	Actions a1=new Actions(driver);
	a1.moveToElement(ele1).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	driver.close();
}

	 
	}

