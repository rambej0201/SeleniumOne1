package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver e = new ChromeDriver();
		e.get("https://www.udemy.com/");
		//e.findElement(By.xpath("//*[@id=\'udemy\']/div[1]/div[2]/div[1]/div[4]/div[4]/require-auth/div/a")).click();
		e.findElement(By.xpath("//div[@class='dropdown dropdown--login']/require-auth/div/a")).click();
	}

}
