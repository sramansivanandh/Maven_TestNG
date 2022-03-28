package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.POM.Book_Hotel;
import com.POM.Login_Page;
import com.POM.Search_Hotel;
import com.POM.Select_Hotel;
import com.POManager.POManager_Adactin;
import com.Reader_Manager.File_Reader_Manager;

public class Runner_Class extends BaseClass {

	public static WebDriver driver = browserLaunch("chrome");

	
//	  public static Login_Page lp = new Login_Page(driver); 
//	  public static Search_Hotel sh = new Search_Hotel(driver); 
//	  public static Select_Hotel sl = new Select_Hotel(driver);
//	  public static Book_Hotel bh = new Book_Hotel(driver);
//	 

	public static POManager_Adactin pom = new POManager_Adactin(driver);

	public static void main(String[] args) throws Throwable {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\ACER\\eclipse-workspace\\ja\\Selenium_Practice\\Driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();

//		browserLaunch("chrome");

//		driver.get("https://adactinhotelapp.com/");

//		LaunchUrl("https://adactinhotelapp.com/");
//
//		driver.manage().window().maximize();
//		
//        Login_Page lp = new Login_Page(driver);

//        lp.getLogin();
//        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//		username.sendKeys("seethasiva");

		String url = File_Reader_Manager.getInstanceFrm().getInstanceCr().getUrl();
		LaunchUrl(url);

		String username = File_Reader_Manager.getInstanceFrm().getInstanceCr().getUsername();
		InputPassing(pom.getInstanceLogin().getUsername(), username);
//		
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("Sivaraman@46");

//		lp.getPassword();

		String password = File_Reader_Manager.getInstanceFrm().getInstanceCr().getPassword();
		InputPassing(pom.getInstanceLogin().getPassword(), password);
//		
//		Thread.sleep(3000);

//		lp.getLogin_btn();
//		
//		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
//		login.click();
//		
		clickTheElement(pom.getInstanceLogin().getLogin_btn());

//		Search_Hotel sh = new Search_Hotel(driver);
//		sh.getLocation();
//		
//		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
//		Select s = new Select(location);
//		s.selectByIndex(3);
		dropDownElement("index", pom.getInstanceSearch().getLocation(), "3");

//		
//		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
//		Select s1 = new Select(hotel);
//		s1.selectByValue("Hotel Sunshine");

		dropDownElement("value", pom.getInstanceSearch().getHotel(), "Hotel Sunshine");

//		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
//		Select s2 = new Select(roomtype);
//		s2.selectByVisibleText("Deluxe");
		dropDownElement("text", pom.getInstanceSearch().getRoomtype(), "Deluxe");
//		
//		WebElement roomNo = driver.findElement(By.xpath("//select[@name='room_nos']"));
//		Select s3 = new Select(roomNo);
//		s3.selectByValue("4");
		dropDownElement("value", pom.getInstanceSearch().getRoomCount(), "4");

//		WebElement datein = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		clearTheValues(pom.getInstanceSearch().getDatein());
//		datein.clear();

		InputPassing(pom.getInstanceSearch().getDatein(), "18/06/2022");
//		datein.sendKeys("18/06/2022");
//		
//		WebElement dateout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		clearTheValues(pom.getInstanceSearch().getDateout());
//		dateout.clear();
		InputPassing(pom.getInstanceSearch().getDateout(), "19/06/2022");
//		dateout.sendKeys("19/06/2022");
//		
//		WebElement count = driver.findElement(By.xpath("//select[@name=\'adult_room\']"));
		try {
			dropDownElement("index", pom.getInstanceSearch().getCount(), "3");
		} catch (Exception e) {

		}
//		dropDownElement("index", sh.getCount(), "3");
//		Select s4 = new Select(count);
//		s4.selectByIndex(3);
//		
//		WebElement childCount = driver.findElement(By.xpath("//select[@name='child_room']"));
		dropDownElement("index", pom.getInstanceSearch().getChildcount(), "3");
//		Select s5 = new Select(childCount);
//		s5.selectByIndex(3);
//		
//		Thread.sleep(3000);
//		
//		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		clickTheElement(pom.getInstanceSearch().getSearchBtn());
//		search.click();

//		Select_Hotel sl = new Select_Hotel(driver);
//		WebElement radioclick = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		clickTheElement(pom.getIntanceSelect().getRadio_Btn());
//		radioclick.click();
//		
//		Thread.sleep(3000);

//		WebElement continue1 = driver.findElement(By.xpath("//input[@type='submit']"));
		clickTheElement(pom.getIntanceSelect().getNext_Btn());
//		continue1.click();

//		Book_Hotel bh = new Book_Hotel(driver);	
//		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		String firstName = File_Reader_Manager.getInstanceFrm().getInstanceCr().getFirstName();
		InputPassing(pom.getInstanceBook().getFirstName(), firstName);
//		name.sendKeys("rishi");
//		
//		WebElement name2 = driver.findElement(By.xpath("//input[@name='last_name']"));
		String secondName = File_Reader_Manager.getInstanceFrm().getInstanceCr().getSecondName();
		InputPassing(pom.getInstanceBook().getSecondName(), secondName);
//		name2.sendKeys("swaara");
//		
//		WebElement address = driver.findElement(By.id("address"));
		String address = File_Reader_Manager.getInstanceFrm().getInstanceCr().getAddress();
		InputPassing(pom.getInstanceBook().getAddress(), address);
//		address.sendKeys("2-2/330,Anandhan street,chennai");
//		
//		WebElement cardNo = driver.findElement(By.xpath("//input[@name='cc_num']"));
		String cardno = File_Reader_Manager.getInstanceFrm().getInstanceCr().getCardno();
		InputPassing(pom.getInstanceBook().getCardNo(), cardno);
//		cardNo.sendKeys("1234567890123456");
//		
//		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		dropDownElement("text", pom.getInstanceBook().getCardType(), "Master Card");
//		Select s6 = new Select(cardType);
//		s6.selectByVisibleText("Master Card");

//		
//		WebElement expMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		dropDownElement("index", pom.getInstanceBook().getExpMonth(), "7");
//		Select s7 = new Select (expMonth);
//		s7.selectByIndex(7);
//		
//		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		dropDownElement("value", pom.getInstanceBook().getExpYear(), "2015");
//		Select s8 = new Select(expYear);
//		s8.selectByValue("2015");
//		
//		WebElement cvvNo = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		String cvvNo = File_Reader_Manager.getInstanceFrm().getInstanceCr().getCvvNo();
		InputPassing(pom.getInstanceBook().getCvvNo(), cvvNo);
//		cvvNo.sendKeys("012");
//		
//		WebElement bookNow = driver.findElement(By.xpath("//input[@type='button']"));
		clickTheElement(pom.getInstanceBook().getBookNow());
//		bookNow.click();

//		WebElement logout = driver.findElement(By.name("Logout"));
//		clickTheElement(logout);
//		logout.click();

	}
}
