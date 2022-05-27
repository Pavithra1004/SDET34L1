//package PracticeOld;
//
//import java.io.IOException;
//
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
//import com.Vitiger.ObjectRepository.ContactWithOrganizationPage;
//import com.Vitiger.ObjectRepository.ContactsPage;
//import com.Vitiger.ObjectRepository.CreateOrganizationPage;
//import com.Vitiger.ObjectRepository.CreatingNewOrganizationPage;
//import com.Vitiger.ObjectRepository.HomePage;
//import com.Vitiger.ObjectRepository.LoginPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateContactWithOrganization {
//	public static void main(String[] args) throws IOException, InterruptedException {
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
//		WebDriver driver=null;
//
//		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
//		String OrganizationName = ExcelMethods.getDataFromExcel("Organization", 2, 1)+randnumber;
//		String LastName=ExcelMethods.getDataFromExcel("Contact",2 , 1)+randnumber;
//		System.out.println(OrganizationName);
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
//		CreatingNewOrganizationPage organizationPage=new CreatingNewOrganizationPage(driver);
//		CreateOrganizationPage createOrganizationPage=new  CreateOrganizationPage(driver);
//		ContactsPage contactsPage=new ContactsPage(driver);
//		ContactWithOrganizationPage contactWithOrganization=new ContactWithOrganizationPage(driver);
//		//driver.get(url);	 
//	//	webDriverMethods.navigateApp(url, driver);
//		//driver.manage().window().maximize();
//	//	webDriverMethods.browserSetting(longTimeOut, driver);
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	//	WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
////		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
////		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
////		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		loginPage.loginAction(un, pwd);
//		homePage.clickOrganizations(driver);
//		//createOrganizationPage.clickCreateOrganization();
//		createOrganizationPage.enterOrganizationName(OrganizationName);
//		createOrganizationPage.saveButton();
//		WebElement actual_OrganizationName = driver.findElement(By.id("dtlview_Organization Name"));
//		jm.assertThroughIfconditionContains(actual_OrganizationName.getText(), OrganizationName, "Organization");
//		homePage.clickContacts();
//		contactsPage.clickContactImg();
//		//contactsPage.enterLastName(LastName);
//		
//		//contactsPage.clickOrganizationImg();
//		WebDriverMethods.switchToWindowOnTitle(driver, OrganizationName);
//		
//		contactWithOrganization.selectOrganizationName(driver, OrganizationName);
//		WebDriverMethods.switchToWindowOnTitle(driver, "Contacts");
//		contactsPage.saveButton();
//		WebElement actual_ContactName = driver.findElement(By.id("dtlview_Last Name"));
//		jm.assertThroughIfconditionContains(actual_ContactName.getText(), LastName, "Contacts ");
////		if(driver.getTitle().contains("Contacts"))
////		{
////			ExcelMethods.setDataIntoExcel("Organization", 19, 5, "Contact is created");
////			ExcelMethods.setDataIntoExcel("Organization", 19, 6, "pass");
////			
////		}
//		//driver.findElement(By.xpath("//a[.='Organizations']")).click();
//		//Thread.sleep(2000);
////		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.name("accountname")).sendKeys(OrganizationName);
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		// WebDriverWait wait=new WebDriverWait(driver, longTimeOut);
//		// wait.until(ExpectedConditions.titleContains(" Organization"));
//		//Thread.sleep(3000);
//		//driver.findElement(By.xpath("//a[.='Contacts']")).click();
//
//		//driver.findElement(By.linkText("Contacts")).click();
////		homePage.clickContacts();
//
////
////		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
////		String Firstname="Sdet1010";
////		String Lastname="BS";
////		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Firstname);
////		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lastname);
////	driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
////
////		Set<String> window = driver.getWindowHandles();
////		for(String Id:window)
////		{
////			driver.switchTo().window(Id);
////			if(driver.getTitle().contains("Accounts&action"))
////			{
////				System.out.println("accout swithed");
////				break;
////			}
////		}
////		driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(OrganizationName);
////		driver.findElement(By.xpath("//input[@name='search']")).click();
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//a[@href='javascript:window.close();']")).click();
////		driver.findElement(By.xpath("//a[@id='1']")).click();
//
////		Set<String> window1 = driver.getWindowHandles();
////		for(String Id1:window1)
////		{
////			driver.switchTo().window(Id1);
////			if(driver.getTitle().contains("Contacts&action"))
////			{
////				System.out.println("accout swithed");
////				break;
////			}
////		}
////		/*Actions act=new Actions(driver);
////		act.doubleClick(e1);
////		driver.switchTo().defaultContent();*/
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//input[@type='submit']")).click();
////		//FileOutputStream fout=new FileOutputStream("./src/test/resources/ExcelData.xlsx");
////		//wb.write(fout);
////		//wb.close();
////		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
////		ExcelMethods.saveExcelData(IConstantsPath.EXCELPATH);
////		ExcelMethods.closeExcel();
//		//Actions act=new Actions(driver);
//		//act.moveToElement(ele1).build().perform();
//		//ele1.click();
////		WebDriverMethods.mouseOverOnTheElement(driver, element);
////		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
//		homePage.signOut(driver);
//		WebDriverMethods.quitBrowser(driver);
//
//	}
//
//
//}
