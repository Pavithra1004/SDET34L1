//package PracticeOld;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import com.Sdet32l1.GenricScript.BaseClass;
//import com.Sdet32l1.GenricScript.ExcelMethods;
//import com.Vitiger.ObjectRepository.CreateOrganizationPage;
//import com.Vitiger.ObjectRepository.CreatingNewOrganizationPage;
//
//public class OrganixzationIndustry  extends BaseClass
//{
//	@Test
//	public void organixzationIndustry()
//	{
//
////	public static void main(String[] args) throws IOException, InterruptedException {
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
////		WebDriver driver=null;
////		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
//		String OrganizationName=ExcelMethods.getDataFromExcel("Organization",2 , 1)+randnumber;
////		System.out.println(OrganizationName);
////
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
////
////		//driver.get(url);	
////		WebDriverMethods.navigateApp(url, driver);
////		//driver.manage().window().maximize();
////		WebDriverMethods.browserSetting(longTimeOut, driver);
////		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////		WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
////		LoginPage loginPage=new LoginPage(driver);
////		HomePage  homePage=new HomePage(driver);
//		CreatingNewOrganizationPage organizationPage=new CreatingNewOrganizationPage(driver);
//		CreateOrganizationPage createOrganizationPage=new CreateOrganizationPage(driver);
//		
//		
////		loginPage.loginAction(un, pwd);
//		hp.clickOrganizations(driver);	
//		organizationPage.clickCreateOrganization(driver);
//		createOrganizationPage.enterOrganizationName(OrganizationName);
//		
//		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//		//driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//		//driver.findElement(By.xpath("//a[.='Organizations' and @href='index.php?module=Accounts&action=index']")).click();
//		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		//Thread.sleep(2000);
//		//driver.findElement(By.name("accountname")).sendKeys(OrganizationName);
//		
////		WebElement ele = driver.findElement(By.xpath("//select[@name='industry']"));
////		//WebDriverMethods.dropdownByValue(ele, "Education");
////		Select s = new Select(ele);
////		s.selectByValue("Education");
////		WebElement ele1 = driver.findElement(By.xpath("//select[@name='accounttype']"));
////		Select s1 = new Select(ele1);
////		s1.selectByValue("Press");
//		//WebDriverMethods.dropdownByValue(ele1, "Press");
//		createOrganizationPage.selectIndustryDropDown("Education");
//		createOrganizationPage.selectTypeDropDown("Press");
//		createOrganizationPage.saveButton();
//		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
////		Thread.sleep(2000);
//		WebElement actual_Organization = driver.findElement(By.id("dtlview_Organization Name"));
//		
//		jm.assertThroughIfconditionContains(actual_Organization.getText(), OrganizationName, "Organization ");
//		//WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//
//		//Actions act=new Actions(driver);
//		//act.moveToElement(ele1).build().perform();
//		//ele1.click();
//		//WebDriverMethods.mouseOverOnTheElement(driver, element);
//		//driver.findElement(By.xpath("//a[.='Sign Out']")).click();
////		homePage.signOut(driver);
////		WebDriverMethods.quitBrowser(driver);
//
//	}
//}
//
