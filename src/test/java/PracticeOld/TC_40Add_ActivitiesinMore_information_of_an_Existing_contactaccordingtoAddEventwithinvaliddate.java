//package PracticeOld;
//
//import java.awt.AWTException;
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
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
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TC_40Add_ActivitiesinMore_information_of_an_Existing_contactaccordingtoAddEventwithinvaliddate {
//public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
//		JavaMethods jm=new JavaMethods();
//		FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
//		String url=FileMethods.getDataFromPropertyFile("url");
//		String un=FileMethods.getDataFromPropertyFile("un");
//		String pwd=FileMethods.getDataFromPropertyFile("pwd");
//		String browser=FileMethods.getDataFromPropertyFile("browser");
//		String timeout=FileMethods.getDataFromPropertyFile("timeout");
//
//		long longTimeOut=JavaMethods.stringToLong(timeout);
//		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
//		String Event_Name=ExcelMethods.getDataFromExcel("Contact",2 , 5);
//		//String Event_Stratdate=ExcelMethods.getDataFromExcelToString("Contact",2 , 6);
//		//String Event_Enddate=ExcelMethods.getDataFromExcelToString("Contact",2 , 7);
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
//		//driver.get(url);	
//		WebDriverMethods.navigateApp(url, driver);
//		//driver.manage().window().maximize();
//		WebDriverMethods.browserSetting(longTimeOut, driver);
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.findElement(By.xpath("//a[.='Contacts']")).click();
//		driver.findElement(By.xpath("//a[.='BS']")).click();
//		WebElement ele = driver.findElement(By.xpath("//a[.='More Information' and @href='index.php?action=CallRelatedList&module=Contacts&record=92&parenttab=Marketing']"));
//		WebDriverMethods.mouseOverOnTheElement(driver, ele);
//		driver.findElement(By.xpath("//a[.='Activities']")).click();
//		driver.findElement(By.xpath("//input[@title='New To Do' and @value='Add Event']")).click();
//	
//		
//		
//		driver.findElement(By.xpath("//input[@class='textbox' and@name='subject']")).sendKeys(Event_Name);
//		
//		driver.findElement(By.xpath("//input[@id='jscal_field_date_start']")).sendKeys(Keys.CONTROL+"a");
//		driver.findElement(By.xpath("//input[@id='jscal_field_date_start']")).sendKeys("2022-05-10");
//		driver.findElement(By.xpath("//input[@id='jscal_field_due_date']")).sendKeys(Keys.CONTROL+"a");
//		driver.findElement(By.xpath("//input[@id='jscal_field_due_date']")).sendKeys("2022-05-10");
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		String text = driver.switchTo().alert().getText();
//		jm.printStatement(text);
//		jm.assertThroughIfcondition(text, "Start Date & Time should be greater than or equal to Current date & time for Activities with status as Planned", "Allert msg displayed");
//		driver.switchTo().alert().accept();
//		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		WebDriverMethods.mouseOverOnTheElement(driver, element);
//		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
//		WebDriverMethods.quitBrowser(driver);
//}
//}
