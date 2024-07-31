package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPrizefromFlipkartUsungXpathAxes {
      public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 15",Keys.ENTER);
		
		//driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../../..//*[name()='svg']"));	
		String p= driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../..//div[contains(text(),'₹')][1]")).getText();	
		System.out.println(p);
      }
}
