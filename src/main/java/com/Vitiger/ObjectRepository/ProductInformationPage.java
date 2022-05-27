package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage {
	
	@FindBy(id="dtlview_Product Name")
	private WebElement actual_ProductName;
	
	public ProductInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String createProductInfo()
	{
		return actual_ProductName.getText();
		
	}
}
