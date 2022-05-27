package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	// declare all the elements and specifyy the access specifier as private
				@FindBy(xpath="//img[@title='Create Contact...']")
				private WebElement createContactImg;
				
				@FindBy(name="lastname")
				private WebElement lastNameTxt;
				
				@FindBy(xpath="//a[.='Create Mail Merge templates ']")
				private WebElement createMailMergetemplatesLink;
				
				
				@FindBy(xpath="//a[.='BS']")
				private WebElement selectExistingRecord;
				
				@FindBy(xpath="//input[@title='Save [Alt+S]']")
				private WebElement saveButton;
			
				
				
				//initialize the driver address to all the elements through constructors and make it as public
				public ContactsPage(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}
				
				//business layer
				public void clickContactImg()
				{
					createContactImg.click();
				}
				
				public void clickMailMergetemplatesLink()
				{
					createMailMergetemplatesLink.click();
				}
				public void clickByLastName()
				{
					lastNameTxt.click();
				}
				public void clickExistingRecord(WebDriver driver)
				{
					selectExistingRecord.click();
				}
				public void saveButton()
				{
					saveButton.click();
				}
				
}
