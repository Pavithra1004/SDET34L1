package com.Vitiger.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.JavaMethods;
import com.Sdet32l1.GenricScript.WebDriverMethods;

public class CreatingNewDocumentPage {
	
	@FindBy(xpath="//img[@title='Create Document...']")
	private WebElement clickDocumentImg;
	
	@FindBy(xpath = "//input[@name='notes_title']")
	private WebElement documentTitleTxt;
	
	@FindBy(xpath="//iframe[@title='Rich text editor, notecontent, press ALT 0 for help.']")
	private WebElement iframe;
	
	@FindBy(xpath="//body[@spellcheck='false' and @class='cke_show_borders']")
	private WebElement documentDescriptionTxt;
	
	@FindBy(xpath="//a[@id='cke_5']")
	private WebElement italic;
	
	@FindBy(xpath="//a[@id='cke_6']")
	private WebElement bold;
	
	@FindBy(xpath="//input[@name='filename']")
	private WebElement fileNameTxt;
	
	@FindBy(xpath="//input[@name='notes_title']/ancestor::tr[1]/preceding-sibling::tr[2]//input[1]")
	private WebElement saveBtn;
	
	public CreatingNewDocumentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickDocumentImg()
	{
		clickDocumentImg.click();
		
	}
	public void clickDocumentIitle(String documentTitle)
	{
		JavaMethods javaMethods=new JavaMethods();
		try {
			javaMethods.customWait(documentTitleTxt, 2, 3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		documentTitleTxt.sendKeys(documentTitle);
	}
	public void switchToFrame(WebDriver driver,WebDriverMethods webDriverMethods)
	{
		webDriverMethods.switchToFrame(driver, iframe);
	}
	public void documentDescriptionTxt(String docDescription,WebDriver driver)
	{
		
		documentDescriptionTxt.sendKeys(docDescription,Keys.CONTROL+"a");
		
	}
	public void italicBoldClick()
	{
		italic.click();
		bold.click();
	}
	public void fileNameTxt(String filePath)
	{
		fileNameTxt.sendKeys(filePath);
	}
	public void saveBtn()
	{
		saveBtn.click();
	}
}
