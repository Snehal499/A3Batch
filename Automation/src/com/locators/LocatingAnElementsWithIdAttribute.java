package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementsWithIdAttribute {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement radioButton=driver.findElement(By.id("gender-male"));
	radioButton.click();
	WebElement name=driver.findElement(By.id("FirstName"));
	name.sendKeys("Snehal");
	WebElement name1=driver.findElement(By.id("LastName"));
	name1.sendKeys("Nikam");
	WebElement email=driver.findElement(By.id("Email"));
	email.sendKeys("snehalnikam4799@gmail.com");
	WebElement password=driver.findElement(By.id("Password"));
	password.sendKeys("Snehal@123");
	WebElement ConfirmPssword=driver.findElement(By.id("ConfirmPassword"));
	ConfirmPssword.sendKeys("Snehal@123");
	WebElement RegisterButton=driver.findElement(By.id("register-button"));
	RegisterButton.click();
}
}
