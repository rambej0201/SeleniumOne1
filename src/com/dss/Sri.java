package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		
		//Create a chromeDriver
		WebDriver S = new ChromeDriver();
		
		// Launch the web site 
		S.get("https://www.linkedin.com/");
		
		//Print a title name
		System.out.println(S.getTitle());;
		
		//Login to LinkedIn
		//Enter Email
		S.findElement(By.id("login-email")).sendKeys("ffffffffff@gmail.com");
		
		//Enter Password
		S.findElement(By.id("login-password")).sendKeys("gggggggggggg");
		
		//Click Singin
		S.findElement(By.id("login-submit")).click();
		
		S.findElement(By.xpath("//*[@id=\'nav-settings__dropdown-trigger\']/div")).click();
		
		// Wait for given sec
		Thread.sleep(1000);
		
		
		S.findElement(By.xpath("//a[@href='/m/logout/']"));
		
		//S.findElement(By.xpath("//a[@id='ember3369']")).click();
		
		Thread.sleep(3000);
		// Close the window
		S.close();
		

	}

};

