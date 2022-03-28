package com.TestNG_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	private void whatsapp() {
        System.out.println("whatsapp");
	}
    @Test
	private void facebook() {
		System.out.println("facebook");
	}
	@Test
	private void twitter() {
		System.out.println("twitter");
	}
	@Ignore
	@Test
	private void spotify() {
        System.out.println("spotify");
	}
	@Test
	private void gaana() {
		System.out.println("gaana");
	}
	@Test(enabled = false)
	private void saavn() {
        System.out.println("saavn");
	}
}
