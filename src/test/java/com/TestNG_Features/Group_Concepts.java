package com.TestNG_Features;

import org.testng.annotations.Test;

public class Group_Concepts {
	
	@Test(groups = "Social Media")
	private void whatsapp() {
        System.out.println("whatsapp");
	}
    @Test(groups = "Social Media")
	private void facebook() {
		System.out.println("facebook");
	}
	@Test(groups = "Social Media")
	private void twitter() {
		System.out.println("twitter");
	}
	@Test(groups = "Music")
	private void spotify() {
        System.out.println("spotify");
	}
	@Test(groups = "Music")
	private void gaana() {
		System.out.println("gaana");
	}
	@Test(groups = "Music")
	private void saavn() {
        System.out.println("saavn");
	}
	@Test(groups = "colors")
	private void green() {
        System.out.println("Green");
	}
	@Test(groups = "colors")
	private void blue() {
        System.out.println("blue");
	}
	@Test(groups = "colors")
	private void red() {
		System.out.println("red");
	}

}
