package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver; //null

	public static WebDriver browserLaunch(String name) {
		
		if (name.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();	
			
		}

		else if (name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
//get
	public static void LaunchUrl(String url) {
		driver.get(url);	
	}
//Send keys
	public static void InputPassing(WebElement element,String input) {
	element.sendKeys(input);
	}
//click	
	public static void clickTheElement(WebElement element) {
    element.click();
	}
//dropDown	
	public static void dropDownElement(String type, WebElement element,String value) {
	Select s = new Select(element);
	if (type.equalsIgnoreCase("index")) {
		int index = Integer.parseInt(value);
		s.selectByIndex(index);
	}
	else if (type.equalsIgnoreCase("value")) {
		s.selectByValue(value);
	}
	else if (type.equalsIgnoreCase("text")) {
		s.selectByVisibleText(value);
	}
	  }	
//Quit	
	public static void quitEntireBrowser() {
		driver.quit();
	}
//Close	
	public static void closeCurrentWindow() {
		driver.close();
	}
//AttributeName/Value
	public static void getAttributeName(WebElement element, String name) {
		element.getAttribute(name);
	}
//clearTheValues
	public static void clearTheValues(WebElement element) {
		element.clear();
	}
}
	
	

	

