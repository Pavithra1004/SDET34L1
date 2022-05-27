//package PracticeOld;
//
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import com.Sdet32l1.GenricScript.ExcelMethods;
//import com.Sdet32l1.GenricScript.FileMethods;
//import com.Sdet32l1.GenricScript.IConstantsPath;
//import com.Sdet32l1.GenricScript.JavaMethods;
//import com.Sdet32l1.GenricScript.WebDriverMethods;
//import com.Vitiger.ObjectRepository.HomePage;
//import com.Vitiger.ObjectRepository.LoginPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TC38AddActivitiesinMoreInformationofanExistingContact {
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//		
//		FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
//		String url=FileMethods.getDataFromPropertyFile("url");
//		String un=FileMethods.getDataFromPropertyFile("un");
//		String pwd=FileMethods.getDataFromPropertyFile("pwd");
//		String browser=FileMethods.getDataFromPropertyFile("browser");
//		String timeout=FileMethods.getDataFromPropertyFile("timeout");
//		JavaMethods jm=new JavaMethods();
//		int randnumber=jm.getRandomNumber(1000);
//		long longTimeOut=JavaMethods.stringToLong(timeout);
//		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
//		String To_Do=ExcelMethods.getDataFromExcel("Contact",2 , 4);
//		String LastName=ExcelMethods.getDataFromExcel("Contact",2 , 1)+randnumber;
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
//		LoginPage loginPage=new LoginPage(driver);
//		HomePage homePage=new HomePage(driver);
//		//driver.get(url);	
//		WebDriverMethods.navigateApp(url, driver);
//		//driver.manage().window().maximize();
//		WebDriverMethods.browserSetting(longTimeOut, driver);
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
//		loginPage.loginAction(un, pwd);
//		homePage.clickContacts();
//		
//		driver.findElement(By.xpath("//a[.='BS']")).click();
//		WebElement ele = driver.findElement(By.xpath("//a[.='More Information' and @href='index.php?action=CallRelatedList&module=Contacts&record=92&parenttab=Marketing']"));
//		WebDriverMethods.mouseOverOnTheElement(driver, ele);
//		driver.findElement(By.xpath("//a[.='Activities']")).click();
//		driver.findElement(By.xpath("//input[@title='New To Do' and @value='Add To Do']")).click();
//		driver.findElement(By.xpath("//input[@class='textbox' and @name='subject']")).sendKeys(To_Do);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		WebDriverMethods.mouseOverOnTheElement(driver, element);
//		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
//		WebDriverMethods.quitBrowser(driver);
//}
//}
////driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
////driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
////driver.findElement(By.xpath("//input[@type='submit']")).click();
////driver.findElement(By.xpath("//a[.='Contacts']")).click();