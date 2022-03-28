package com.TestNG_Features;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("set Property");
	}
	
	@BeforeTest
	private void url() {
        System.out.println("Launch the Url");
	}
	
	@BeforeClass
	private void maximize() {
		System.out.println("maximize the browser");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("Logout");
	}
	
	@Test
	private void Mens() {
        System.out.println("Mens Dresses");
	}
	
	@Test
	private void Womens() {
		System.out.println("Womens Dresses");
	}
	
	@Test
	private void Kids() {

		System.out.println("Kids Dresses");
	}
	
	@AfterClass
	private void CurrentUrl() {
		System.out.println("Current Url");
	}
	
	@AfterTest
	private void close() {
        System.out.println("close the browser");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("delete cookies");
	}
}


