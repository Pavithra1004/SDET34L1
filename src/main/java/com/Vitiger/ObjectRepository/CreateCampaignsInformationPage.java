package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignsInformationPage {
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement actual_Campaignsname;
	
	public CreateCampaignsInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String createCampgaignInfo()
	{
		return actual_Campaignsname.getText();
		
	}
}
