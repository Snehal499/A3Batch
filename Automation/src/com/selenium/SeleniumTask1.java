package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/TUF%20GAMING/Downloads/Assessment1.html");
		driver.findElement(By.xpath("//button[text()=' Click Me !!!']")).click();
		
		String ParentWindowId=driver.getWindowHandle();
		Set<String> allWindowId=driver.getWindowHandles();
		allWindowId.remove(ParentWindowId);
		
		for (String WindowId:allWindowId) {
			Thread.sleep(3000);
	     driver.switchTo().window(WindowId);
	    }
		 driver.close();
	}

}
