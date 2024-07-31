package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaturingUlofFacebook {
	public static void main(String[] args) {
		WebDriver Facebook=new ChromeDriver();
		Facebook.manage().window().maximize();
		Facebook.get("https://www.facebook.com/");
		
		WebElement emailTextBox = Facebook.findElement(By.id("email"));
		WebElement PasswordTextBox = Facebook.findElement(By.id("passContainer"));
		Rectangle email = emailTextBox.getRect();
		Rectangle Password = PasswordTextBox.getRect();
		
		System.out.println(email.getHeight()+" "+Password.getHeight());
		System.out.println(email.getWidth()+" "+Password.getWidth());
		System.out.println(email.getX()+" "+Password.getX());
		System.out.println(email.getY()+" "+Password.getY());
		
		System.out.println("Gap :"+ (Password.getY()-(email.getY()+email.getHeight())));
	}
}
