package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignsPage {
	@FindBy(name="campaignname")
	private WebElement campaignNameTxt;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement productImg;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//initialize the driver address to all the elements through constructors and make it as public
	public CreateCampaignsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void createCampgaignName(WebDriver driver,String campaignName)
	{
		campaignNameTxt.sendKeys(campaignName);
	}
	public void selectProductImg()
	{
		productImg.click();
	}
	public void saveButton()
	{
		saveButton.click();
	}
}
