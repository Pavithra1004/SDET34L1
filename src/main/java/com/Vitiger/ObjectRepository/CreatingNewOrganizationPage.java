package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage {
	// declare all the elements and specifyy the access specifier as private
	
			@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
			private WebElement createOrganization;
			
			
			//initialize the driver address to all the elements through constructors and make it as public
			public CreatingNewOrganizationPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//business layer
			public void clickCreateOrganization()
			{
				createOrganization.click();
			}
			
}
