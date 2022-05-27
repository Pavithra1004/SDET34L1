package com.Product.Vtiger;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.CreatingNewProductPage;
import com.Vitiger.ObjectRepository.ProductInformationPage;

public class CreateProductTest extends BaseClass {
	String productName;
	CreatingNewProductPage creatingNewProductPage;
	ProductInformationPage productInformationPage;
	@Test(groups = "sanity")
	public void createProductTest()
	{
		productName=ExcelMethods.getDataFromExcel("Product",2 , 1)+randNumber;
		creatingNewProductPage=new CreatingNewProductPage(driver);
		productInformationPage=new ProductInformationPage(driver);
		homePage.clickProducts(driver);
		creatingNewProductPage.createProductImg(driver);
		creatingNewProductPage.productNameTxt(driver, productName);
		creatingNewProductPage.saveButton(driver);
		javaMethods.assertThroughIfconditionContains(productInformationPage.createProductInfo(), productName, "Producs");
	}
}
