//
//package PracticeOld;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
//import com.Sdet32l1.GenricScript.BaseClass;
//import com.Sdet32l1.GenricScript.ExcelMethods;
//import com.Sdet32l1.GenricScript.FileMethods;
//import com.Sdet32l1.GenricScript.IConstantsPath;
//import com.Sdet32l1.GenricScript.JavaMethods;
//import com.Sdet32l1.GenricScript.WebDriverMethods;
//import com.Vitiger.ObjectRepository.CreatingNewCampaignPage;
//import com.Vitiger.ObjectRepository.CreateCampaignsInformationPage;
//import com.Vitiger.ObjectRepository.CreateCampaignsPage;
//import com.Vitiger.ObjectRepository.HomePage;
//import com.Vitiger.ObjectRepository.LoginPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateCompaignTest extends BaseClass {
//	
//	String Campaignsname;
//	CreatingNewCampaignPage cp;
//	CreateCampaignsPage ccp;
//	
//	//public static void main(String[] args) throws IOException, InterruptedException {
////		JavaMethods jm=new JavaMethods();
////		FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
////		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
////		String url=FileMethods.getDataFromPropertyFile("url");
////		String un=FileMethods.getDataFromPropertyFile("un");
////		String pwd=FileMethods.getDataFromPropertyFile("pwd");
////		String browser=FileMethods.getDataFromPropertyFile("browser");
////		String timeout=FileMethods.getDataFromPropertyFile("timeout");
////
////		long longTimeOut=jm.stringToLong(timeout);
////		int randnumber=jm.getRandomNumber(1000);
////		
////		WebDriver driver=null;
////		switch (browser) {
////		case "chrome":
////			WebDriverManager.chromedriver().setup();
////			driver=new ChromeDriver();
////			break;
////		case "firefox":
////			WebDriverManager.firefoxdriver().setup();
////			driver=new FirefoxDriver();
////			break;
////
////		default: {
////			System.out.println("please specify the browser");
////			WebDriverManager.firefoxdriver().setup();
////			driver=new FirefoxDriver();
////		}
////		break;
////		}
//	@Test
//	public void createCompaignTest()
//	{
//		 Campaignsname=ExcelMethods.getDataFromExcel("Campaign",2 , 1)+randnumber;
////		WebDriverMethods.navigateApp(url, driver);
////		WebDriverMethods.browserSetting(longTimeOut, driver);
////		LoginPage lp=new LoginPage(driver);
////		HomePage hp=new HomePage(driver);
////		lp.loginAction(un,pwd);
//		hp.clickCampaign(driver);
//		 cp=new CreatingNewCampaignPage(driver);
//		 ccp=new CreateCampaignsPage(driver);
//		cp.clickCreateCampaign(driver);
//		ccp.createCampgaignName(driver, Campaignsname);
//		ccp.saveButton();
//		WebElement Actual_Campaignsname=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
//		jm.assertThroughIfconditionContains(Actual_Campaignsname.getText(), Campaignsname, "Campaigns  ");
//		//hp.signOut(driver);
//		//WebDriverMethods.quitBrowser(driver);
//	}
//}
////driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//		//driver.findElement(By.xpath("//input[@type='submit']")).click();
//		//WebElement moreLink = driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
//		//WebDriverMethods.mouseOverOnTheElement(driver, moreLink);
//		
//		//driver.findElement(By.xpath("//a[@name='Campaigns']")).click();
////		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
////driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(Campaignsname);
////driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
////Thread.sleep(3000);
////WebElement Actual_Campaignsname = driver.findElement(By.id("mouseArea_Campaign Name"));
////if(Actual_Campaignsname.getText().contains(Campaignsname))
////
////{
////	jm.printStatement("Campaigns created sucessfully");
////	jm.printStatement("TC pass");
////}
////WebElement ele1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
////Thread.sleep(3000);
////WebDriverMethods.mouseOverOnTheElement(driver, ele1);
////driver.findElement(By.xpath("//a[.='Sign Out']")).click();