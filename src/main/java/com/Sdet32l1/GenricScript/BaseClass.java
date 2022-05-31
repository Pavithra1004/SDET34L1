
package com.Sdet32l1.GenricScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Vitiger.ObjectRepository.HomePage;
import com.Vitiger.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This class contains all the common action for script
 * 
 * @author anand
 *
 */
public class BaseClass {

	public String url;
	public String userName;
	public String password;
	public String browser;
	public String timeout;
	public long longTimeOut;
	public int randNumber;
	public WebDriver driver;
	public JavaMethods javaMethods;
	public LoginPage loginPage;
	public HomePage homePage;
	public WebDriverMethods  webDriverMethods;
	static  WebDriver staticdriver;
	/**
	 * This before suite is used for open the Excel and Property file and also get the database connection
	 * @throws IOException
	 */
	@BeforeSuite(groups = "baseclass")
	public void beforeSuite() throws IOException {
		FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
	}
	/**
	 * This method is used to fetch the data from the propty file and excel, 
	 * launch the browser  and navigate to the application
	 * @throws IOException
	 */
	//@Parameters("browser")
	@BeforeClass(groups = "baseclass")
	public void beforeClass(/*String browser*/) throws IOException
	{
		javaMethods=new JavaMethods();

		
		//this is required
		url=FileMethods.getDataFromPropertyFile("url");
		userName=FileMethods.getDataFromPropertyFile("un");
		password=FileMethods.getDataFromPropertyFile("pwd");
		browser=FileMethods.getDataFromPropertyFile("browser");

		
		//		String URL=System.getProperty("URL");
		//		String UN=System.getProperty("UN");
		//		String PWD=System.getProperty("PWD");
		//		String BROWSER=System.getProperty("BROWSER");
		//		
		timeout=FileMethods.getDataFromPropertyFile("timeout");

		randNumber=javaMethods.getRandomNumber(1000);

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
		staticdriver=driver;
		webDriverMethods=new WebDriverMethods();
		loginPage=new LoginPage(driver);
		homePage=new HomePage(driver);
		webDriverMethods=new WebDriverMethods();
		webDriverMethods.navigateApp(url, driver);
		webDriverMethods.browserSetting(longTimeOut, driver);
	}
	/**
	 * This method is used for login action
	 */
	@BeforeMethod(groups = "baseclass")
	public void beforeMethod()
	{

		loginPage.loginAction(userName,password);
	}
	/**
	 * This method is used to logout the application
	 */
	@AfterMethod(groups = "baseclass")
	public void afterMethod()
	{
		homePage.signOut(driver, webDriverMethods);
	}
	/**
	 * This method is used to close the browser
	 */
	@AfterClass(groups = "baseclass")
	public void afterClass()
	{
		webDriverMethods.quitBrowser(driver);
	}
	/**
	 * This method is used to close the Excel file and database connection
	 * @throws IOException
	 */
	@AfterSuite(groups = "baseclass")
	public void afterSuite() throws IOException
	{
		ExcelMethods.closeExcel();

	}
}
