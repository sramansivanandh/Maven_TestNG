package com.TestNG_Features;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	
	@Test(priority = 1)
	private void setProperty() {
		System.out.println("setProperty");
	}
	@Test(priority = 2)
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@Test(priority = 3)
	private void maximize() {
        System.out.println("maximize");
	}

	@Test(priority = 4)
	private void closeTheBrowser() {
        System.out.println("closeTheBrowser");
	}
	
	@Test(priority = 5,invocationCount = 2)
	private void refreshTheBrowser() {
		System.out.println("refreshThePage");
	}
}
