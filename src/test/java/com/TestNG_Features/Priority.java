package com.TestNG_Features;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = -1)
	private void Mens() {
        System.out.println("Mens Dresses");
	}
	
	@Test(priority = 0)
	private void Womens() {
		System.out.println("Womens Dresses");
	}
	
	@Test
	private void Kids() {

		System.out.println("Kids Dresses");
	}
}
