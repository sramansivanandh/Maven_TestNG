package com.TestNG_Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prameterized_Test {
	
	
	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("rishi") String username, String password) {
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);

	}

}
