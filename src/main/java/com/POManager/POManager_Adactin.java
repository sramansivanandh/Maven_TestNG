package com.POManager;

import org.openqa.selenium.WebDriver;

import com.POM.Book_Hotel;
import com.POM.Login_Page;
import com.POM.Search_Hotel;
import com.POM.Select_Hotel;

public class POManager_Adactin {
	
	public static WebDriver driver;
	
	private Login_Page login;
	private Search_Hotel search;
	private Select_Hotel select;
	private Book_Hotel book;

	public POManager_Adactin(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getInstanceLogin() {
		
		if (login==null) {
			login = new Login_Page(driver);
		}
		return login;
	}

	public Search_Hotel getInstanceSearch() {
		if (search==null) {
			search = new Search_Hotel(driver);
		}
		return search;
	}

	public Select_Hotel getIntanceSelect() {
		if (select == null) {
			select = new Select_Hotel(driver);
		}
		return select;
	}

	public Book_Hotel getInstanceBook() {
		
		if (book==null) {
			book = new Book_Hotel(driver);
		}
		return book;
	}
}
