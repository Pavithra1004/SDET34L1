//package PracticeOld;
//
//import java.io.IOException;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import com.Sdet32l1.GenricScript.ExcelMethods;
//import com.Sdet32l1.GenricScript.FileMethods;
//import com.Sdet32l1.GenricScript.IConstantsPath;
//import com.Sdet32l1.GenricScript.JavaMethods;
//import com.Sdet32l1.GenricScript.WebDriverMethods;
//import com.Vitiger.ObjectRepository.ContactsPage;
//import com.Vitiger.ObjectRepository.HomePage;
//import com.Vitiger.ObjectRepository.LoginPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateContactTest 
//{		
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
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
//		String LastName=ExcelMethods.getDataFromExcel("Contact",2 , 1)+randnumber;
//		System.out.println(LastName);
//
//		WebDriver driver=null;
//		switch (browser) {
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
//		break;
//		}
//		LoginPage lp=new LoginPage(driver);
//	       HomePage hp=new HomePage(driver);
//	       ContactsPage contactsPage=new ContactsPage(driver);
//		//driver.get(url);	
//		WebDriverMethods.navigateApp(url, driver);
//		//driver.manage().window().maximize();
//		WebDriverMethods.browserSetting(longTimeOut, driver);
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
//		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
//		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
//		//driver.findElement(By.xpath("//input[@type='submit']")).click();
//		lp.loginAction(un, pwd);
//		hp.clickContacts();
//		contactsPage.clickContactImg();
//		//contactsPage.enterLastName(LastName);
//		contactsPage.saveButton();
//		WebElement actual_ContactName = driver.findElement(By.id("dtlview_Last Name"));
//		jm.assertThroughIfconditionContains(actual_ContactName.getText(), LastName, "Contacts ");
//		//driver.findElement(By.xpath("//a[.='Contacts']")).click();
////		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing']")).click();
////		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName);
////		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//////		
////		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
////
////		//Actions act=new Actions(driver);
////		//act.moveToElement(ele1).build().perform();
////		//ele1.click();
////		WebDriverMethods.mouseOverOnTheElement(driver, element);
////		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
//		hp.signOut(driver);
//		WebDriverMethods.quitBrowser(driver);
//
//
//	}
//
//}
