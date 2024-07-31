package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementsUsingClassAttribute {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("snehalnikam4799@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Snehal@123");
		driver.findElement(By.className("login-button")).click();
	}
}
