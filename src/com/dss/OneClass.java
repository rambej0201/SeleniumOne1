package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver q = new ChromeDriver();
		
		q.get("https://www.google.com");
		q.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("California");
		//q.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/input")).sendKeys("California");
		//q.findElement(By.xpath("//form[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		Thread.sleep(2000);
		
		q.close();

	}

}
