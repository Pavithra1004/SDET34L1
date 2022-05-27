
package com.Sdet32l1.GenricScript;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

/**
 *  This class contains only java specific reusable methods
 * @author anand
 *
 */
public class JavaMethods {
	/**
	 * This method is used to convert String value to long datatype
	 * @param value
	 * @return
	 */
public static long stringToLong(String value)
{
	return Long.parseLong(value);
	
}
/**
 * This method is used to get the random number
 * @param limit
 * @return
 */
public int getRandomNumber(int limit)
{
	Random rand=new Random();
	return rand.nextInt(limit);
}
/**
 * This method is used to print the statement
 * @param message
 */
public void printStatement(String message)
{
	System.out.println(message);
}
/**
 * It is used to validate the statement
 * @param Actualresult
 * @param Expectedresult
 * @param testCaseName
 */
public void assertThroughIfcondition(String Actualresult,String Expectedresult,String testCaseName)
{
	if(Actualresult.equalsIgnoreCase(Expectedresult))
	{
		System.out.println(testCaseName+" created successfully");
		System.out.println("TC pass");
	}
}
/**
 * This method is used to validate by using contains
 * @param Actualresult
 * @param Expectedresult
 * @param testCaseName
 */
public void assertThroughIfconditionContains(String Actualresult,String Expectedresult,String testCaseName)
{
	if(Actualresult.contains(Expectedresult))
	{
//		System.out.println(testCaseName+"Created successfully");
//		System.out.println("TC pass");
		Reporter.log(testCaseName+"Created successfully", true);
		Reporter.log("TC pass",true);
		Reporter.log("Actual result is--->"+Actualresult+" Expected Result is--->"+Expectedresult,true);
	}
}
/**
 * This method is used to wait till the element is loaded
 * @param ele
 * @param pollingTime
 * @param duration
 * @throws InterruptedException
 */
public void customWait(WebElement ele,long pollingTime,int duration) throws InterruptedException
{
	int count=0;
	while(count<=duration)
	{
		try {
			ele.click();
			break;
		}catch(Exception e)
		{
			Thread.sleep(pollingTime*1000);
			count++;
			
		}
		
	}
}
/**
 * This method is used to get the system date and time
 * @return
 */
public String dateTimeInFormat()
{
	 return new SimpleDateFormat("dd_MM_yy_HH_mm_sss").format(new Date());
}
}
