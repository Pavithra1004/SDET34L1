//package PracticeOld;
//
//import java.awt.AWTException;
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
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
//import com.Vitiger.ObjectRepository.CreatingNewDocumentPage;
//import com.Vitiger.ObjectRepository.HomePage;
//import com.Vitiger.ObjectRepository.LoginPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateDocumentTest extends BaseClass {
//
//	@Test
//	public void createDocumentTest()
//	{
////	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
////		JavaMethods jm=new JavaMethods();
////		FileMethods.openPropertyFile(IConstantsPath.PROPERTYFILEPATH);
////		String url=FileMethods.getDataFromPropertyFile("url");
////		String un=FileMethods.getDataFromPropertyFile("un");
////		String pwd=FileMethods.getDataFromPropertyFile("pwd");
////		String browser=FileMethods.getDataFromPropertyFile("browser");
////		String timeout=FileMethods.getDataFromPropertyFile("timeout");
////
////		long longTimeOut=JavaMethods.stringToLong(timeout);
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
////		default: 
////		{
////			System.out.println("please specify the browser");
////			WebDriverManager.firefoxdriver().setup();
////			driver=new FirefoxDriver();
////		}
////		break;
////		}
////
////		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);	
//		String DocumentTitle = ExcelMethods.getDataFromExcel("Document",2,1)+randnumber;
//		String DocumentDescription =  ExcelMethods.getDataFromExcel("Document",2,2);
//		String Documentpath =  ExcelMethods.getDataFromExcel("Document",2,3);
//
////		WebDriverMethods.navigateApp(url, driver);
////		WebDriverMethods.browserSetting(longTimeOut, driver);
////
////		LoginPage loginPage=new LoginPage(driver);
////		HomePage homePage=new HomePage(driver);
//		CreatingNewDocumentPage documentPage=new CreatingNewDocumentPage(driver);
////		loginPage.loginAction(un, pwd);
//		hp.clickDocuments(driver);
////		WebDriverMethods.explicitlyWait(driver, longTimeOut);
//	    documentPage.clickDocumentImg();
//		documentPage.clickDocumentIitle(DocumentTitle);
//		//Thread.sleep(2000);
//		documentPage.switchToFrame(driver);
//		documentPage.documentDescriptionTxt(DocumentDescription, driver);
//		driver.switchTo().defaultContent();
//		documentPage.italicBoldClick();
//		documentPage.fileNameTxt(Documentpath);
//		documentPage.saveBtn();
//		//WebDriverMethods.explicitlyWait(driver, longTimeOut);
//		//hp.signOut(driver);
//		//WebDriverMethods.quitBrowser(driver);
//		
//		
//
//		/*driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(longTimeOut, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.findElement(By.xpath("//a[.='Documents']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Document...']")).click();
////		driver.findElement(By.xpath("//input[@name='notes_title']")).sendKeys(DocumentTitle);
////
//		
////		driver.findElement(By.xpath("//body[@class='cke_show_borders']")).sendKeys(DocumentDescription,Keys.CONTROL+"a");
////		driver.switchTo().defaultContent();
////		driver.findElement(By.xpath("//a[@id='cke_5']")).click();
////		driver.findElement(By.xpath("//a[@id='cke_6']")).click();
//        // driver.findElement(By.xpath("//input[@name='filename']")).sendKeys(Documentpath);
////		driver.findElement(By.xpath("(//input[@accesskey='S'])[2]")).click();
// 
////		WebElement ele2 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
// *///driver.switchTo().frame(elef);
////		WebDriverMethods.mouseOverOnTheElement(driver, ele2);
////		/*Actions act=new Actions(driver);
////		act.moveToElement(ele2).perform();*/
////
////		WebElement ele3 = driver.findElement(By.xpath("//a[.='Sign Out']"));
////		ele3.click();
//	}
//
//}
