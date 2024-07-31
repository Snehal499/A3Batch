package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAccessementQue2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 15 (128 GB) - Black')]/../../../..//button[text()='Add to cart']")).click();
		
		String Prize=driver.findElement(By.xpath("//span[contains(text(),'iPhone 15 (128 GB) - Black')]/../../../..//span[contains(@class,'a-price-whole')]")).getText();
		System.out.println(Prize);
	}
}
