package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.WebDriverMethods;

public class CreatingNewCampaignPage {

	
	// declare all the elements and specifyy the access specifier as private
		@FindBy(xpath="//img[@title='Create Campaign...']")
		private WebElement createCampaign;
		
		
		//initialize the driver address to all the elements through constructors and make it as public
		public CreatingNewCampaignPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//business layer
		public void clickCreateCampaign(WebDriver driver,WebDriverMethods webDriverMethods)
		{
			webDriverMethods.mouseOverOnTheElement(driver, createCampaign);
			createCampaign.click();
		}
		
}