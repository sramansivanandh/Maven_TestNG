package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomCount;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement dateout;
	
	@FindBy(xpath = "//select[@name=\\'adult_room\\']")
	private WebElement count;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childcount;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchBtn;

	public Search_Hotel(WebDriver driver2) {
	
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomCount() {
		return roomCount;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getCount() {
		return count;
	}

	public WebElement getChildcount() {
		return childcount;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
	

}
