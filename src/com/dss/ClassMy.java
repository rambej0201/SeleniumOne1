package com.dss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassMy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  String baseUrl = "https://github.com/rambej0201";
	      String expectedTitle = "rambej0201 (RamBej) · GitHub";
	      String actualTitle = "";

	      // launch Chrome and direct it to the Base URL
	      driver.get(baseUrl);

	      // get the actual value of the title
	      actualTitle = driver.getTitle();

	      /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        Thread.sleep(5000);
	       
	        //String secondURL = "https://www.google.com/search?ei=tOXoWsPeCYjYjwO2oqSIAQ&q=Raghuram+Bejjanki&oq=Raghuram+Bejjanki&gs_l=psy-ab.12...0.0.0.6868.0.0.0.0.0.0.0.0..0.0....0...1..64.psy-ab..0.0.0....0.oDfeZ-o0vSw";
	        driver.get("https://www.google.com/");
	        
	        Thread.sleep(3000);
	        
	        //String thirdURL = "https://www.linkedin.com/in/bejjanki-r-9ba527129";
	        driver.get("https://www.linkedin.com/in/bejjanki-r-9ba527129");
	        
	        Thread.sleep(5000);
	        //close Fire fox
	        driver.close();

	}

}