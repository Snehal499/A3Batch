package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithNameAttribute {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	
	WebElement radioButton=driver.findElement(By.name("Gender"));
	radioButton.click();
	WebElement name=driver.findElement(By.name("FirstName"));
	name.sendKeys("Snehal");
	WebElement name1=driver.findElement(By.name("LastName"));
	name1.sendKeys("Nikam");
	WebElement email=driver.findElement(By.name("Email"));
	email.sendKeys("snehalnikam4799@gmail.com");
	WebElement password=driver.findElement(By.name("Password"));
	password.sendKeys("Snehal@123");
	WebElement ConfirmPssword=driver.findElement(By.name("ConfirmPassword"));
	ConfirmPssword.sendKeys("Snehal@123");
	WebElement RegisterButton=driver.findElement(By.name("register-button"));
	RegisterButton.click();
	
	driver.get("https://demowebshop.tricentis.com/login");
	WebElement emailTextBox=driver.findElement(By.name("Email"));
	emailTextBox.sendKeys("snehalnikam4799@gmail.com");
	WebElement passwordTextBox=driver.findElement(By.name("Password"));
	passwordTextBox.sendKeys("snehal@123");
}
}
