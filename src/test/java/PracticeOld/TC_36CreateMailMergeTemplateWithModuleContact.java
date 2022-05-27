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
//import com.Vitiger.ObjectRepository.ContactsPage;
//import com.Vitiger.ObjectRepository.CreateMailMergeWithTemplatePage;
//import com.Vitiger.ObjectRepository.HomePage;
//import com.Vitiger.ObjectRepository.LoginPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TC_36CreateMailMergeTemplateWithModuleContact {
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
//		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
//		String Template_File=ExcelMethods.getDataFromExcel("Contact",2 , 3);
//		
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
//	       CreateMailMergeWithTemplatePage createMailMergeWithTemplatePage=new CreateMailMergeWithTemplatePage(driver);
//		//driver.get(url);	
//		WebDriverMethods.navigateApp(url, driver);
//		//driver.manage().window().maximize();
//		WebDriverMethods.browserSetting(longTimeOut, driver);
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
//		lp.loginAction(un, pwd);
//		hp.clickContacts();
//		contactsPage.clickMailMergetemplatesLink();
//		createMailMergeWithTemplatePage.selectTemplateFile(Template_File);
//		createMailMergeWithTemplatePage.selectModuleDropdown("Contacts");
//		Thread.sleep(2000);
//		createMailMergeWithTemplatePage.saveButton();
//		jm.printStatement("Template is saved successfully");
//		hp.signOut(driver);
//		WebDriverMethods.quitBrowser(driver);
//
//}
//}
///*
// * //driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
// * //driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
// * //driver.findElement(By.xpath("//input[@type='submit']")).click();
// * //driver.findElement(By.xpath("//a[.='Contacts']")).click();
// * //driver.findElement(By.xpath("//a[.='Create Mail Merge templates ']")).click
// * (); contactsPage.clickMailMergetemplatesLink(); //
// * driver.findElement(By.xpath("//input[@type='file']")).sendKeys(Template_File)
// * ; // // WebElement ele =
// * driver.findElement(By.xpath("//select[@name='target_module']")); //
// * WebDriverMethods.initializeSelect(ele); // WebDriverMethods.dropdownByValue(
// * "Contacts");
// * createMailMergeWithTemplatePage.selectTemplateFile(Template_File);
// * createMailMergeWithTemplatePage.selectModuleDropdown("Contacts");
// * Thread.sleep(2000); createMailMergeWithTemplatePage.saveButton();
// * //driver.findElement(By.xpath("//input[@title='Save']")).click();
// * jm.printStatement("Template is saved successfully"); //WebElement element =
// * driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
// * //WebDriverMethods.mouseOverOnTheElement(driver, element);
// * //driver.findElement(By.xpath("//a[.='Sign Out']")).click();
// * hp.signOut(driver); WebDriverMethods.quitBrowser(driver);
// */