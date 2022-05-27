package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.WebDriverMethods;

public class CreateOrganizationPage {
	//driver.findElement(By.xpath("//input[@name='accountname' and @class='detailedViewTextBox']")).sendKeys(OrganizationName);
	//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organizationNameTxt;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement organizationIndustryDropDown;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement organizationTypeDropDown;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//initialize the driver address to all the elements through constructors and make it as public
	public CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterOrganizationName(String organizationsName)
	{
		organizationNameTxt.sendKeys(organizationsName);
	}
	public void selectIndustryDropDown(String industryName,WebDriverMethods webDriverMethods)
	{
		webDriverMethods.initializeSelect(organizationIndustryDropDown);
		webDriverMethods.dropdownByValue(industryName);
		
	}
	public void selectTypeDropDown(String industryType,WebDriverMethods webDriverMethods)
	{
		webDriverMethods.initializeSelect(organizationTypeDropDown);
		webDriverMethods.dropdownByValue(industryType);
		
	}
	public void saveButton()
	{
		saveButton.click();
	}
	



}
