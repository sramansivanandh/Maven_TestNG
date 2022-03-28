package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File(
				"C:\\Users\\ACER\\eclipse-workspace\\ja\\Maven_Project\\src\\main\\java\\com\\Property_File\\Configuration.properties");
        FileInputStream fis = new FileInputStream(f);
        p = new Properties();
        p.load(fis);
	}

	public String getUrl() throws Throwable {
        String url = p.getProperty("url");
        return url;
	}
	
	public String getUsername() throws Throwable {
        String username = p.getProperty("username");
        return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
   public String getFirstName() {
	   String name1 = p.getProperty("name1");
	   return name1;
   }
   
   public String getSecondName() {
	   String name2 = p.getProperty("name2");
	   return name2;
  }
   
   public String getAddress() {
	   String address = p.getProperty("address");
	   return address;
  }
   public String getCardno() {
        String cardNo = p.getProperty("cardNo");
        return cardNo;
  }
   public String getCvvNo() {
         String cvvNo = p.getProperty("cvvNo");
         return cvvNo;
}

}
