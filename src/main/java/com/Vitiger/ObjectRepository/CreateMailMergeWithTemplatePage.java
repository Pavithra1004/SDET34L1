package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.WebDriverMethods;

public class CreateMailMergeWithTemplatePage {
	@FindBy(xpath="//input[@type='file']")
	private WebElement templateFileBtn;
	
	@FindBy(xpath="//select[@name='target_module']")
	private WebElement moduleDropdown;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement saveButton;
	
	public CreateMailMergeWithTemplatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void selectTemplateFile(String file)
	{
		templateFileBtn.sendKeys(file);
	}

	public void selectModuleDropdown(String module,WebDriverMethods webDriverMethods)
	{
		webDriverMethods.initializeSelect(moduleDropdown);
		webDriverMethods.dropdownByValue(module);
	}
	public void saveButton()
	{
		saveButton.click();
	}
}
