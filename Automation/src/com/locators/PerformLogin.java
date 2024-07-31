package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLogin {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	
    driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).
	sendKeys("snehalnikam4799@gmail.com", Keys.TAB,"Snehal@123",Keys.ENTER);
	}
}