package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.WebDriverMethods;

public class ContactInformationPage {
	
	@FindBy(xpath="//a[.='More Information']")
	private WebElement moreInfolink;
	
	@FindBy(id="dtlview_Last Name")
	private WebElement actual_ContactName;
	
	@FindBy(xpath="//a[.='Activities']")
	private WebElement activitieslink;
	
	public ContactInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickMorelink(WebDriver driver,WebDriverMethods webDriverMethods)
	{
		webDriverMethods.mouseOverOnTheElement(driver, moreInfolink);
	}
	
	public void clickActivitieslink()
	{
		
		activitieslink.click();
	}
	public String contactInfo()
	{
		return actual_ContactName.getText();
		
	}

}
