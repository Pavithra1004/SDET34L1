package com.Vitiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingToDoPage {
	@FindBy(xpath="//input[@class='textbox' and @name='subject']")
	private WebElement toDoTxt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitBtn;
	
	public CreatingToDoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterToDoTxt(String toDo)
	{
		toDoTxt.sendKeys(toDo);
	}
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}
}


