package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPrizeOfAmazonUsingXpathDI {
      public static void main(String[] args) {
		ChromeDriver Amazon=new ChromeDriver();
		Amazon.manage().window().maximize();
		Amazon.get("https://www.amazon.in/");
		Amazon.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15",Keys.ENTER);
		Amazon.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Blue']/../../../..//span[@class='a-price-whole']"));
	}
}
