package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsofFlipkartUsingXpathByTextFunction {
     public static void main(String[] args) {
		ChromeDriver flipkart=new ChromeDriver();
		flipkart.manage().window().maximize();
		flipkart.get("https://www.flipkart.com/");
		
		flipkart.findElement(By.xpath("//span[text()='Mobiles']")).click();
		//flipkart.findElement(By.xpath("//a[.='Mobiles']")).click();
	}
}
