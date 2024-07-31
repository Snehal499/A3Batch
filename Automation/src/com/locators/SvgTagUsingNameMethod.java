package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgTagUsingNameMethod {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 15",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Blue, 128 GB)']/../../../../../../..//div[contains(@class,'oUss6M _2EB96d')]")).click();	
	}
}
