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
//import com.Vitiger.ObjectRepository.HomePage;
//import com.Vitiger.ObjectRepository.LoginPage;
//import com.Vitiger.ObjectRepository.CreatingNewProductPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CreateProductTest extends BaseClass {
//	@Test
//	public void createProductTest()
//	{
////	public static void main(String[] args) throws IOException {
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
////		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
//		String ProductName=ExcelMethods.getDataFromExcel("Product",2 , 1)+randnumber;
////		System.out.println(ProductName);
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
////		LoginPage lp=new LoginPage(driver);
////	       HomePage hp=new HomePage(driver);
//       CreatingNewProductPage pp=new CreatingNewProductPage(driver);
////		//driver.get(url);	
////		WebDriverMethods.navigateApp(url, driver);
////		//driver.manage().window().maximize();
////		WebDriverMethods.browserSetting(longTimeOut, driver);
////		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////		WebDriverMethods.waitTillPageLoad(longTimeOut, driver);
////
////		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
////		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
////		driver.findElement(By.xpath("//input[@type='submit']")).click();
////		driver.findElement(By.xpath("//a[.='Products']")).click();
////		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
//
////		lp.loginAction(un, pwd);
//		hp.clickProducts(driver);
//		//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
//		pp.createProductImg(driver);
//		//driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(ProductName);
//		pp.productNameTxt(driver, ProductName);
//		
//		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		pp.saveButton(driver);
//		WebElement actual_Prosuct = driver.findElement(By.id("dtlview_Product Name"));
//		jm.assertThroughIfconditionContains(actual_Prosuct.getText(), ProductName, "Products ");
////		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(ProductName);
////		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
////		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
////
////		//Actions act=new Actions(driver);
////		//act.moveToElement(ele1).build().perform();
////		//ele1.click();
////		WebDriverMethods.mouseOverOnTheElement(driver, element);
////		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
////		hp.signOut(driver);
////		WebDriverMethods.quitBrowser(driver);
//
//	}
//}
