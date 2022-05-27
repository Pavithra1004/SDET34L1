package com.Vitiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.WebDriverMethods;

public class ContactWithOrganizationPage {
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement organizationNameTxt;
	
	@FindBy(name="search")
	private WebElement SearchBtn;
	
	public ContactWithOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public  void selectOrganizationName(WebDriver driver,String organizationsName,WebDriverMethods webDriverMethods) throws InterruptedException
	{
		webDriverMethods.switchToWindowOnTitle(driver, "Organization");
		organizationNameTxt.sendKeys(organizationsName);
		SearchBtn.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='"+organizationsName+"']")).click();
	}
}
