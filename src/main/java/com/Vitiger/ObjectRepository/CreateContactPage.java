package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	@FindBy(name="lastname")
	private WebElement lastNameTxt;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement selectOrganizationNameContactImg;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	public void enterLastName(String lastName)
	{
		lastNameTxt.sendKeys(lastName);
	}
	public void clickOrganizationImg()
	{
		selectOrganizationNameContactImg.click();
	}
	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
