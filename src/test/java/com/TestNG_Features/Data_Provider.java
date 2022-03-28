package com.TestNG_Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider  = "testData")
	private void credentials(String username,String password) {
		
		System.out.println("username is "+ username);
		System.out.println("password is "+ password);
	}
	
	@DataProvider
	private Object[][] testData() {
		
		return new Object [] [] {
			
			{"starc", "ssr251"},
			{"smith", "swr425"},
			{"wade", "dhat856"}
		
		};
 }
	@Test(dataProvider = "testData2")
	private void credential2(String name, int password) {
		System.out.println("name is "+name);
		System.out.println("password is "+password);
	}
	@DataProvider
	private Object[][] testData2() {
		return new Object [] [] {
			
			{"swaara", 1254},
			{"rishi", 1452},
			{"dhruv", 1245}
			
			};
		}

	}



	