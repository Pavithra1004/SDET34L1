package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentInformationPage {
	@FindBy(id="dtlview_Title")
	private WebElement actual_DocumentName;
	
	
	public DocumentInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String createDocumentInfo()
	{
		return actual_DocumentName.getText();
		
	}
}
