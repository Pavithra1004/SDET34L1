package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewProductPage {
	
	// declare all the elements and specifyy the access specifier as private
	
			@FindBy(xpath="//img[@title='Create Product...']")
			private WebElement createProductImg;
			
			@FindBy(name="productname")
			private WebElement productNameTxt;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement saveButton;
			
			//initialize the driver address to all the elements through constructors and make it as public
			public CreatingNewProductPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//business layer
			public void createProductImg(WebDriver driver)
			{
				createProductImg.click();
			}
			public void productNameTxt(WebDriver driver,String productName)
			{
				productNameTxt.sendKeys(productName);
			}
			public void saveButton(WebDriver driver)
			{
				saveButton.click();
			}
}
