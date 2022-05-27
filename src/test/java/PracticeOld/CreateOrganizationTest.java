//package PracticeOld;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//import com.Sdet32l1.GenricScript.BaseClass;
//import com.Sdet32l1.GenricScript.ExcelMethods;
//import com.Sdet32l1.GenricScript.FileMethods;
//import com.Sdet32l1.GenricScript.IConstantsPath;
//import com.Sdet32l1.GenricScript.JavaMethods;
//import com.Sdet32l1.GenricScript.WebDriverMethods;
//import com.Vitiger.ObjectRepository.CreateOrganizationPage;
//import com.Vitiger.ObjectRepository.HomePage;
//import com.Vitiger.ObjectRepository.LoginPage;
//import com.Vitiger.ObjectRepository.CreatingNewOrganizationPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateOrganizationTest extends BaseClass {
//
//	@Test
//	public void createOrganizationTest() {
//		String OrganizationName=ExcelMethods.getDataFromExcel("Organization",2 , 1)+randnumber;
//		CreatingNewOrganizationPage organizationPage=new CreatingNewOrganizationPage(driver);
//		CreateOrganizationPage createOrganizationPage=new CreateOrganizationPage(driver);
//		organizationPage.clickCreateOrganization(driver);
//		createOrganizationPage.enterOrganizationName(OrganizationName);
//		createOrganizationPage.saveButton();
//		WebElement actual_OrganizationName = driver.findElement(By.id("dtlview_Organization Name"));
//		jm.assertThroughIfconditionContains(actual_OrganizationName.getText(), OrganizationName, "Organization");
////		public static void main(String[] args) throws IOException, InterruptedException {
////			JavaMethods jm=new JavaMethods();
////			FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
////			String url=FileMethods.getDataFromPropertyFile("url");
////			String un=FileMethods.getDataFromPropertyFile("un");
////			String pwd=FileMethods.getDataFromPropertyFile("pwd");
////			String browser=FileMethods.getDataFromPropertyFile("browser");
////			String timeout=FileMethods.getDataFromPropertyFile("timeout");
////
////			long longTimeOut=JavaMethods.stringToLong(timeout);
////			int randnumber=jm.getRandomNumber(1000);
////			WebDriver driver=null;
////			ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
////			String OrganizationName=ExcelMethods.getDataFromExcel("Organization",2 , 1)+randnumber;
////			System.out.println(OrganizationName);
////
////			switch (browser) {
////			case "chrome":
////				WebDriverManager.chromedriver().setup();
////				driver=new ChromeDriver();
////				break;
////			case "firefox":
////				WebDriverManager.firefoxdriver().setup();
////				driver=new FirefoxDriver();
////				break;
////
////			default: {
////				System.out.println("please specify the browser");
////				WebDriverManager.firefoxdriver().setup();
////				driver=new FirefoxDriver();
////			}
////			break;
////			}
////
////			//driver.get(url);	
////			WebDriverMethods.navigateApp(url, driver);
////			//driver.manage().window().maximize();
////			WebDriverMethods.browserSetting(longTimeOut, driver);
////			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////			WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
////
////		LoginPage loginPage=new LoginPage(driver);
////		HomePage  homePage=new HomePage(driver);
//		
//		
////		loginPage.loginAction(un, pwd);
////		homePage.clickOrganizations(driver);	
//		
//		//driver.findElement(By.name("user_name")).sendKeys(un);
//		//driver.findElement(By.name("user_password")).sendKeys(pwd);
//		//driver.findElement(By.id("submitButton")).click();
//		//driver.findElement(By.xpath("//a[.='Organizations' and @href='index.php?module=Accounts&action=index']")).click();
//		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		//driver.findElement(By.xpath("//input[@name='accountname' and @class='detailedViewTextBox']")).sendKeys(OrganizationName);
//		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		
//		//WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
////		homePage.signOut(driver);
//		//Actions act=new Actions(driver);
//		//act.moveToElement(ele1).build().perform();
//		//ele1.click();
//		//WebDriverMethods.mouseOverOnTheElement(driver, element);
//		//driver.findElement(By.xpath("//a[.='Sign Out']")).click();
////		WebDriverMethods.quitBrowser(driver);
//	
//		}
//
//	}
//
///*	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//JavaMethods jm=new JavaMethods();
//FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
//String url=FileMethods.getDataFromPropertyFile("url");
//String un=FileMethods.getDataFromPropertyFile("un");
//String pwd=FileMethods.getDataFromPropertyFile("pwd");
//String browser=FileMethods.getDataFromPropertyFile("browser");
//String timeout=FileMethods.getDataFromPropertyFile("timeout");
//
//long longTimeOut=JavaMethods.stringToLong(timeout);
//int randnumber=jm.getRandomNumber(1000);
//ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
//String OrganizationName=ExcelMethods.getDataFromExcel("Organization",2 , 1)+randnumber;
//System.out.println(OrganizationName);
//WebDriver driver=null;
//switch (browser) 
//{
//case "chrome":
//WebDriverManager.chromedriver().setup();
//driver=new ChromeDriver();
//break;
//case "firefox":
//WebDriverManager.firefoxdriver().setup();
//driver=new FirefoxDriver();
//break;
//
//default: {
//System.out.println("please specify the browser");
//WebDriverManager.firefoxdriver().setup();
//driver=new FirefoxDriver();
//}
//
////driver.get(url);	
//WebDriverMethods.navigateApp(url, driver);
////driver.manage().window().maximize();
//WebDriverMethods.browserSetting(longTimeOut, driver);
////driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
//*/
//
//
//
//
//
