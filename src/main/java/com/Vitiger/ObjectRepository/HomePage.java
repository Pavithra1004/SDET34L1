package com.Vitiger.ObjectRepository;
//create the Homepage as webpage make it as public

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.WebDriverMethods;

public class HomePage {
// declare all the elements and specifyy the access specifier as private
	@FindBy(linkText="More")
	private WebElement moreDropdown;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignsTab;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrIcon;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;
	//driver.findElement(By.xpath("//a[.='Products']")).click();
	
	@FindBy(linkText="Products")
	private WebElement productsLink;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationsLink;
	
	@FindBy(linkText="Documents")
	private WebElement documentsLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsLink;
	
	
	//initialize the driver address to all the elements through constructors and make it as public
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//business layer
	public void clickCampaign(WebDriver driver,WebDriverMethods webDriverMethods)
	{
		webDriverMethods.mouseOverOnTheElement(driver, moreDropdown);
		campaignsTab.click();
	}
	public void clickProducts(WebDriver driver)
	{
		productsLink.click();
	}
	public void clickOrganizations(WebDriver driver)
	{
		organizationsLink.click();
	}
	public void clickDocuments(WebDriver driver)
	{
		documentsLink.click();
	}
	public void clickContacts()
	{
		contactsLink.click();
	}
	public void signOut(WebDriver driver,WebDriverMethods webDriverMethods)
	{
		webDriverMethods.mouseOverOnTheElement(driver, administrIcon);
		signOutLink.click();
	}
	
}
