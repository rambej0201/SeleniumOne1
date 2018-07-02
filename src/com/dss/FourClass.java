package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver i = new ChromeDriver();
		
		i.get("https://www.24hourfitness.com/");
		System.out.println(i.getCurrentUrl());
		System.out.println(i.getTitle());
		System.out.println("=========================================");
		i.findElement(By.xpath("//*[@id=\"at-footer-investor-login\"]")).click();
		Thread.sleep(1000);
		System.out.println(i.getCurrentUrl());
		System.out.println(i.getTitle());
		System.out.println("=========================================");
		i.findElement(By.xpath("//a[@href='Registration.html']")).click();
		Thread.sleep(1000);
		System.out.println(i.getCurrentUrl());
		System.out.println(i.getTitle());
		System.out.println("=========================================");
		i.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Juliean");
		i.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Mohan");
		i.findElement(By.xpath("//*[@id='company']")).sendKeys("svrjc");
		i.findElement(By.xpath("//*[@id='address1']")).sendKeys("Road No.2, Padmanagar, Nizamabad");
		i.findElement(By.xpath("//*[@id='address2']")).sendKeys("Varni Road");
		i.findElement(By.xpath("//*[@id='city']")).sendKeys("Nizamabad");
		i.findElement(By.xpath("//*[@id='state']/option[6]")).click();
		i.findElement(By.xpath("//*[@id='zip']")).sendKeys("42001");
		i.findElement(By.xpath("//*[@id='phoneNumber']")).sendKeys("5486718965");
		i.findElement(By.xpath("//*[@id='email']")).sendKeys("Mohan@gmail.com");
		i.findElement(By.xpath("//*[@id='emailConfirm']")).sendKeys("Mohan@gmail.com");
		i.findElement(By.xpath("//*[@id='comments']")).sendKeys("Hi my name is Mohan I am from California");
		System.out.println(i.getCurrentUrl());
		System.out.println(i.getTitle());
		System.out.println("=========================================");
		i.findElement(By.xpath("//*[@id='next']")).click();
		System.out.println(i.getCurrentUrl());
		System.out.println(i.getTitle());
		System.out.println("=========================================");
		
		Thread.sleep(5000);
		i.close();

	}

}
