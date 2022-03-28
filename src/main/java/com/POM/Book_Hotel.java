package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
@FindBy(xpath = "//input[@name='first_name']")
private WebElement firstName;

@FindBy(xpath = "//input[@name='last_name']")
private WebElement secondName;

@FindBy(id=("address"))
private WebElement Address;

@FindBy(xpath=("//input[@name='cc_num']"))
private WebElement cardNo; 

@FindBy(xpath = "//select[@name='cc_type']")
private WebElement cardType;

@FindBy(xpath = "//select[@name='cc_exp_month']")
private WebElement expMonth;

@FindBy(xpath = "//select[@name='cc_exp_year']")
private WebElement expYear;

@FindBy(xpath = "//input[@name='cc_cvv']")
private WebElement cvvNo;

@FindBy(xpath = ("//input[@type='button']"))
private WebElement bookNow;

public Book_Hotel(WebDriver driver2) {
	this.driver= driver2;
	
	PageFactory.initElements(driver, this);
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getSecondName() {
	return secondName;
}

public WebElement getAddress() {
	return Address;
}

public WebElement getCardNo() {
	return cardNo;
}

public WebElement getCardType() {
	return cardType;
}

public WebElement getExpMonth() {
	return expMonth;
}

public WebElement getExpYear() {
	return expYear;
}

public WebElement getCvvNo() {
	return cvvNo;
}

public WebElement getBookNow() {
	return bookNow;
}





}
