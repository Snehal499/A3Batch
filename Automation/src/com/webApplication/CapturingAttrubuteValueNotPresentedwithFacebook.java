package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingAttrubuteValueNotPresentedwithFacebook {
	public static void main(String[] args) {
		WebDriver Facebook=new ChromeDriver();
		Facebook.manage().window().maximize();
		Facebook.get("https://www.facebook.com/");
		WebElement Attribute = Facebook.findElement(By.id("email"));
		Attribute.sendKeys("Snehal");
		System.out.println(Attribute.getAttribute("value"));
	}
}
