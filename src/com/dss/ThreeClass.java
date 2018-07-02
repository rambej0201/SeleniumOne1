package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver e = new ChromeDriver();
		
		e.get("https://study.eshipglobal.com/slogin.asp");
		e.findElement(By.xpath("//input[@name='username']")).sendKeys("saradha85@gmail.com");
		e.findElement(By.xpath("//input[@name='upassword']")).sendKeys("ghurhf849");
		//e.findElement(By.xpath("//input[@id='ilogin']")).click();
		//e.findElement(By.xpath("//input[@class='ibutton']")).click();
		Thread.sleep(15000);
		e.close();
	}

}
