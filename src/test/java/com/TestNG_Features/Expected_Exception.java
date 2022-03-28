package com.TestNG_Features;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void exception() {

		int a= 0;
		
		System.out.println(a/0);
	}

}
