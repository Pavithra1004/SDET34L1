package com.Vitiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sdet32l1.GenricScript.JavaMethods;
import com.Sdet32l1.GenricScript.WebDriverMethods;

public class ProductSearchPage {

	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement ProductNameTxt;

	@FindBy(name="search")
	private WebElement SearchBtn;

	@FindBy(id="1")
	private WebElement clickProductName;

	public ProductSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public  void selectProduct(WebDriver driver,String productsName,WebDriverMethods webDriverMethods) throws InterruptedException 
	{
		webDriverMethods.switchToWindowOnTitle(driver, "Products");
		ProductNameTxt.sendKeys(productsName);
		SearchBtn.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='"+productsName+"']")).click();
		//clickProductName.click();
	}


}
