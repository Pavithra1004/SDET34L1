package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.JavaMethods;

public class OrganizationInformationPage {
	
	@FindBy(id="dtlview_Organization Name")
	private WebElement actual_OrganizationName;
	
	
	public OrganizationInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String createOrganizationInfo() 
	{
		JavaMethods  javaMethods=new JavaMethods();
		try {
			javaMethods.customWait(actual_OrganizationName, 2, 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return actual_OrganizationName.getText();
		
	}
}
