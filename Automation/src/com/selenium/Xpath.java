package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver path=new ChromeDriver();
		path.manage().window().maximize();
		path.get("file:///C:/Users/TUF%20GAMING/Desktop/ABCD.html");
		
		path.findElement(By.xpath("//input[@placeholder='A']"));
	}
}
