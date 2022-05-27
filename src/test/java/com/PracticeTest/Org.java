//package com.PracticeTest;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import com.Sdet32l1.GenricScript.ExcelMethods;
//import com.Sdet32l1.GenricScript.FileMethods;
//import com.Sdet32l1.GenricScript.IConstantsPath;
//import com.Sdet32l1.GenricScript.JavaMethods;
//import com.Sdet32l1.GenricScript.WebDriverMethods;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Org {
//	public static void main(String[] args) throws IOException {
//
//
//		JavaMethods jm=new JavaMethods();
//		FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
//		String url=FileMethods.getDataFromPropertyFile("url");
//		String un=FileMethods.getDataFromPropertyFile("un");
//		String pwd=FileMethods.getDataFromPropertyFile("pwd");
//		String browser=FileMethods.getDataFromPropertyFile("browser");
//		String timeout=FileMethods.getDataFromPropertyFile("timeout");
//
//		long longTimeOut=JavaMethods.stringToLong(timeout);
//		int randnumber=jm.getRandomNumber(1000);
//		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
//		String OrganizationName=ExcelMethods.getDataFromExcel("Organization",2 , 1)+randnumber;
//		System.out.println(OrganizationName);
//		WebDriver driver=null;
//		switch (browser) 
//		{
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			break;
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//			break;
//
//		default: {
//			System.out.println("please specify the browser");
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		
//		//driver.get(url);	
//		WebDriverMethods.navigateApp(url, driver);
//		//driver.manage().window().maximize();
//		WebDriverMethods.browserSetting(longTimeOut, driver);
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
//		
//		driver.findElement(By.name("user_name")).sendKeys(un);
//		driver.findElement(By.name("user_password")).sendKeys(pwd);
//		driver.findElement(By.id("submitButton")).click();
//}
//}
//}