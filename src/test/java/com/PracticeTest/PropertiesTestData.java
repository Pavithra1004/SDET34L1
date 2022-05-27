package com.PracticeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class PropertiesTestData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/commonDtata.Properties");
	    Properties property = new Properties();
	    property.load(fis);
	    String url=property.getProperty("url");
	    String un=property.getProperty("un");
	    String pwd=property.getProperty("pwd");
	    String browser=property.getProperty("browser");
	    String timeout=property.getProperty("timeout");
	    
	   
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(browser);
		System.out.println(timeout);
	}

}
