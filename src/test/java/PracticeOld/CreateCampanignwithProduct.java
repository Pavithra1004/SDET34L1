package PracticeOld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.CreateCampaignsPage;
import com.Vitiger.ObjectRepository.CreatingNewCampaignPage;
import com.Vitiger.ObjectRepository.CreatingNewProductPage;
import com.Vitiger.ObjectRepository.ProductSearchPage;
//Campaign with product
public class CreateCampanignwithProduct extends BaseClass {

	@Test
	public void createCampanignwithProduct()
	{
		
       CreatingNewProductPage pp=new CreatingNewProductPage(driver);
       CreatingNewCampaignPage cp=new CreatingNewCampaignPage(driver);
       CreateCampaignsPage ccp=new CreateCampaignsPage(driver);
       //ProductSearchPage cwpp=new ProductSearchPage(driver);
       String ProductName = ExcelMethods.getDataFromExcel("Campaign", 2, 2)+randNumber;
       String Campaignsname=ExcelMethods.getDataFromExcel("Campaign",2 , 1)+randNumber;
		homePage.clickProducts(driver);
		pp.createProductImg(driver);
		pp.productNameTxt(driver, ProductName);
		pp.saveButton(driver);
		homePage.clickCampaign(driver, webDriverMethods);
		cp.clickCreateCampaign(driver, webDriverMethods);
		ccp.createCampgaignName(driver, Campaignsname);
		ccp.selectProductImg();
		webDriverMethods.switchToWindowOnTitle(driver, Campaignsname);
		//cwpp.selectProduct(driver, ProductName);
		webDriverMethods.switchToWindowOnTitle(driver, "Campaigns");
		ccp.saveButton();
		WebElement Actual_Campaignsname=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		WebElement Actual_Productname=driver.findElement(By.id("dtlview_Product"));
		javaMethods.assertThroughIfconditionContains(Actual_Campaignsname.getText(), Campaignsname, "Campaigns");
		javaMethods.assertThroughIfconditionContains(Actual_Productname.getText(), ProductName, "Producs");
	}
}