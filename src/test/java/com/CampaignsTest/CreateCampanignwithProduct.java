package com.CampaignsTest;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.CreateCampaignsInformationPage;
import com.Vitiger.ObjectRepository.CreateCampaignsPage;
import com.Vitiger.ObjectRepository.CreatingNewCampaignPage;
import com.Vitiger.ObjectRepository.CreatingNewProductPage;
import com.Vitiger.ObjectRepository.ProductInformationPage;
import com.Vitiger.ObjectRepository.ProductSearchPage;

public class CreateCampanignwithProduct extends BaseClass {
	CreatingNewProductPage creatingNewProductPage;
	CreatingNewCampaignPage creatingNewCampaignPage;
	CreateCampaignsPage createCampaignsPage;
	ProductSearchPage productSearchPage;
	CreateCampaignsInformationPage createCampaignsInformationPage;
	ProductInformationPage productInformationPage;
	public String productName;
	String campaignsName;
	@Test(groups = {"sanity","regression"})
	public void createCampanignwithProduct() throws InterruptedException
	{

		creatingNewProductPage=new CreatingNewProductPage(driver);
		creatingNewCampaignPage=new CreatingNewCampaignPage(driver);
		createCampaignsPage=new CreateCampaignsPage(driver);
		productSearchPage=new ProductSearchPage(driver);
		createCampaignsInformationPage=new CreateCampaignsInformationPage(driver);
		productInformationPage=new ProductInformationPage(driver);

		productName = ExcelMethods.getDataFromExcel("Campaign", 2, 2)+randNumber;
		campaignsName=ExcelMethods.getDataFromExcel("Campaign",2 , 1)+randNumber;

		homePage.clickProducts(driver);
		creatingNewProductPage.createProductImg(driver);
		creatingNewProductPage.productNameTxt(driver, productName);
		creatingNewProductPage.saveButton(driver);
		javaMethods.assertThroughIfconditionContains(productInformationPage.createProductInfo(), productName, "Products");
		homePage.clickCampaign(driver,webDriverMethods);
		creatingNewCampaignPage.clickCreateCampaign(driver,webDriverMethods);
		createCampaignsPage.createCampgaignName(driver, campaignsName);
		createCampaignsPage.selectProductImg();
		webDriverMethods.switchToWindowOnTitle(driver, productName);
		productSearchPage.selectProduct(driver, productName,webDriverMethods);
		
		webDriverMethods.switchToWindowOnTitle(driver, "Campaigns");
		createCampaignsPage.saveButton();
		javaMethods.assertThroughIfconditionContains(createCampaignsInformationPage.createCampgaignInfo(), campaignsName, "Campaigns");

	}
}