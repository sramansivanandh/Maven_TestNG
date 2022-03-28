package com.TestNG_Features;

import org.testng.annotations.Test;

public class TimeOut {

	@Test(timeOut = 8000)
	private void LoginPage() throws Throwable {
		System.out.println("setProperty");
		Thread.sleep(2000);
		
		System.out.println("getUrl");
		
		Thread.sleep(2000);
		
		System.out.println("userName");
		Thread.sleep(1000);
		
		System.out.println("password");
		Thread.sleep(2000);
		
		System.out.println("login");
		
	}
	
	
}
