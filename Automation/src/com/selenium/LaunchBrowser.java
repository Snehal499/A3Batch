package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.out.println();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	
	 WebElement email = driver.findElement(By.id("Email"));
	email.sendKeys("abdc",Keys.ENTER);
	}
}
