package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactMoreInformationPage {
	
	@FindBy(xpath="//input[@title='New To Do' and @value='Add To Do']")
	private WebElement toDoBtm;
	
	@FindBy(xpath="//input[@title='New To Do' and @value='Add Event']")
	private WebElement addEventBtm;
	
	public ContactMoreInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickToDoBtm()
	{
		toDoBtm.click();
	}
	public void clickAddEventBtm()
	{
		addEventBtm.click();
	}

}
