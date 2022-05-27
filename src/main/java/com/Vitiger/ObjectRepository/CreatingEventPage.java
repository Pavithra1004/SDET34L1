package com.Vitiger.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingEventPage {
	@FindBy(xpath="//input[@class='textbox' and@name='subject']")
	private WebElement eventNameTxt;
	
	@FindBy(xpath="//input[@id='jscal_field_date_start']")
	private WebElement selectStartDateTxt;
	
	@FindBy(xpath="//input[@id='jscal_field_due_date']")
	private WebElement selectEndDateTxt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public CreatingEventPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterEventNameTxt(String event_Name)
	{
		eventNameTxt.sendKeys(event_Name);
	}
	public void selectStartDate()
	{
		selectStartDateTxt.sendKeys(Keys.CONTROL+"a");
	}
	public void enterStartDate()
	{
		selectStartDateTxt.sendKeys("2022-05-17");
	}
	public void selectEndDate()
	{
		selectEndDateTxt.sendKeys(Keys.CONTROL+"a");
	}
	public void enterEndDate()
	{
		selectEndDateTxt.sendKeys("2022-05-17");
	}
	public void clickSaveBtn()
	{
		saveBtn.click();
	}
}
