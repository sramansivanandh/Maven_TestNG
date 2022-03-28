package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio_Btn;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement next_Btn;

	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_Btn() {
		return radio_Btn;
	}

	public WebElement getNext_Btn() {
		return next_Btn;
	}
	
	
}
