package com.Sdet32l1.GenricScript;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is used to maintain all the webdriver common actions
 * @author anand
 *
 */
public class WebDriverMethods {
	
	
	public  WebDriverWait wait;
	public Actions act;
	public Select select;
	public JavascriptExecutor js;
	
	/**
	 * This method is used to navigate to applicator
	 * @param url
	 * @param driver
	 */
	public  void navigateApp(String url,WebDriver driver)
	{
		driver.get(url);
	}
	/**
	 * This method is used for browser setting
	 * @param longTimeOut
	 * @param driver
	 */
	public  void browserSetting(long longTimeOut,WebDriver driver)
	{
		driver.manage().window().maximize();
		waitTillPageLoad(longTimeOut,driver);
	}
	/**
	 * This method is used to implicitly wait until page load
	 * @param longTimeOut
	 * @param seconds
	 */
	public  void waitTillPageLoad(long longTimeOut, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(longTimeOut, TimeUnit.SECONDS);

	}
	/**
	 * This method is used to maximize the browser
	 * @param driver
	 */
	public  void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();

	}
	/**
	 * This method is used to mouse over on the element
	 * @param driver
	 * @param moreLink
	 */
	public   void mouseOverOnTheElement(WebDriver driver,WebElement moreLink) {
		act=new Actions(driver);
		act.moveToElement(moreLink).perform();
	}
	/**
	 * This method is used for closde the browser
	 * @param driver
	 */
	public  void quitBrowser(WebDriver driver)
	{
		driver.close();
	}
	/**
	 * This method is used to wait the control till the particular element is visible
	 * @param element
	 */
	public  void waitUntillElememtVisible(WebElement element)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is used to wait the control till the particular element is clickable
	 * @param element
	 */
	public  void waitUntillElememtClickable(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * This method is used for initialize the wait instance
	 * @param driver
	 * @param timeOut
	 */
	public  void explicitlyWait(WebDriver driver,long timeOut)
	{
		wait=new WebDriverWait(driver, timeOut);
	}
	/**
	 * This method is used to switch the window based on title
	 * @param driver
	 * @param partialText
	 */
	public  void switchToWindowOnTitle(WebDriver driver,String partialText)
	{
		Set<String> window = driver.getWindowHandles();
		for(String Id:window)
		{
			driver.switchTo().window(Id);
			if(driver.getTitle().contains(partialText))
			{
				break;
			}
		}
	}
	/**
	 * This method is used to initialize the select class
	 * @param ele
	 */
	public  void initializeSelect(WebElement ele)
	{
		select = new Select(ele);

	}
	/**
	 * This method is used to select by visible text
	 * @param ele
	 * @param VisibleText
	 */
	public  void dropDownByVisibleText(String VisibleText)
	{
		select.selectByVisibleText(VisibleText);
	}
	/**
	 * This method is used to select by Index
	 * @param ele
	 * @param index
	 */
	public  void dropDownByIndex(int index)
	{
		select.selectByIndex(index);
	}
	/**
	 * This method is used to select by Value
	 * @param ele
	 * @param value
	 */
	public  void dropdownByValue(String value)
	{
		select.selectByValue(value);
	}
	/**
	 * double click 
	 * @param driver
	 */
	
	/**
	 * This method is used to double click on element
	 * @param driver
	 * @param ele
	 */
	public  void doubleClick(WebDriver driver,WebElement ele)
	{
		act.doubleClick(ele).perform();
	}
	/**
	 * This method is used to right click on element
	 * @param ele
	 * @param driver
	 */
	public  void rightClick(WebElement ele,WebDriver driver)
	{
		
		act.contextClick(ele).perform();
	}
	/**
	 * This method is used to mouseover on element
	 * @param ele
	 * @param driver
	 */
	public  void mouseOver(WebElement ele,WebDriver driver)
	{
		
		act.moveToElement(ele).perform();
	}
	/**
	 * This method is used to drag and drop the element
	 * @param ele
	 * @param driver
	 */
	public  void dragAndDrop(WebElement ele,WebDriver driver)
	{
		act.contextClick(ele).perform();
	}
	/**
	 * This method is used to switch the frame by using index
	 * @param driver
	 * @param index
	 */
	public  void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch the frame by using webElement
	 * @param driver
	 * @param nameorId
	 */
	public  void switchToFrame(WebDriver driver,WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	/**
	 * This method is used to switch the frame by using name or Id
	 * @param driver
	 * @param nameorId
	 */
	public  void switchToFrame(WebDriver driver,String nameorId)
	{
		driver.switchTo().frame(nameorId);
	}
	/**
	 * This is used to switch back to home frame
	 * @param driver
	 */
	public  void switchBackHome(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to initialize the JavascriptExecutor
	 * @param driver
	 */
	public   void initializeJs(WebDriver driver)
	{
		 js=(JavascriptExecutor)driver;		
	}
	/**
	 * This method is used to enter the data into specified element by using JavascriptExecutor
	 * @param driver
	 * @param ele
	 * @param data
	 */
	public  void enterDataThroughJs(WebDriver driver,WebElement ele,String data)
	{
		js.executeScript("arguements[0].value=arguements[1]", ele,data);
	}
	/**
	 * This method is used to scroll the page till the element location is specified by using JavascriptExecutor
	 * @param ele
	 */
	public  void clickThroughJs(WebElement ele)
	{
		js.executeScript("arguements[0].click()", ele);
	}
	/**
	 * This method is used to Navigate the application through by using JavascriptExecutor 
	 * @param url
	 */
	public  void navigateAppThroughJs(String url)
	{
		js.executeScript("window.location=arguements[0]", url);
	
	}
	/**
	 * This method is used to scroll the page to SpecifiedHeight
	 * @param Height
	 */
	public  void scrollToSpecifiedHeight(String Height)
	{
		js.executeScript("window.scrollBy(0,"+Height+")");
	}
	/**
	 * This method is used to scroll to bottom
	 */
	public  void scrollToBottom()
	{
		js.executeScript("window.scrollBy(0.document.body.scrollHeight)");
	}
	public  void scrollTillElement(WebElement ele)
	{
		js.executeScript("arguement[0].scrollIntoView()", ele);
	}
	/**
	 * This method is used to take ScreenShot  when testcase is failed
	 * @param driver
	 * @param fileName
	 * @throws IOException
	 */
	public String takesScreenShot(WebDriver driver,String fileName) throws IOException
	{
		JavaMethods jm=new JavaMethods();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./Screenshot/"+fileName+"_"+jm.dateTimeInFormat()+".png");
		FileUtils.copyFile(src, dst);	
		 return (dst.getAbsolutePath());
			
	}
	/**
	 * This method is used to accept the allert popup
	 * @param driver
	 */
	public void allertaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * This method is used to dismiss the allert popup
	 * @param driver
	 */
	public void allertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This method is used to send the data to allert popup
	 * @param driver
	 * @param data
	 */
	public void allertSendData(WebDriver driver,String data)
	{
		driver.switchTo().alert().sendKeys(data);
	}
	/**
	 * This method is used to get the text from the allert popup
	 * @param driver
	 * @param data
	 * @return 
	 */
	public  String getAlertText(WebDriver driver)
	{
		 return driver.switchTo().alert().getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}