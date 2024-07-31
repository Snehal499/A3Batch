package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementsofFacebookWithTagName {
	public static void main(String[] args) {
		ChromeDriver facebook=new ChromeDriver();
		facebook.get("https://www.facebook.com/");
		facebook.manage().window().maximize();
		
		facebook.findElement(By.id("email")).sendKeys("9730508075");
		facebook.findElement(By.id("pass")).sendKeys("Raje@99");
		facebook.findElement(By.tagName("button")).click();
	}
}
