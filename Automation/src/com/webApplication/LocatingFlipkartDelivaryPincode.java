package com.webApplication;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingFlipkartDelivaryPincode {
	public static void main(String[] args) {
		WebDriver flipkart=new ChromeDriver();
		flipkart.manage().window().maximize();
		flipkart.get("https://www.flipkart.com/");
		
		String parentWindowId=flipkart.getWindowHandle();
		
		WebElement searchArea=flipkart.findElement(By.name("q"));
		searchArea.sendKeys("vivo 5g mobile",Keys.ENTER);
		flipkart.findElement(By.partialLinkText("vivo T3x 5G (Celestial Green, 128 GB)")).click();
		
		Set<String> allwindowId=flipkart.getWindowHandles();
		allwindowId.remove(parentWindowId);
		
		for(String windowId:allwindowId) {
			flipkart.switchTo().window(windowId);
		}
		
		flipkart.findElement(By.id("pincodeInputId")).sendKeys("411305",Keys.ENTER);
		}
}
