package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsOfDemoShopUsingXpathAxes {
	public static void main(String[] args) {
		ChromeDriver demo=new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://demowebshop.tricentis.com/register");
		demo.findElement(By.partialLinkText("ELECTRONICS")).click();
		demo.findElement(By.partialLinkText("Cell phones")).click();
		demo.findElement(By.xpath("//a[text()='Phone Cover']/../..//input[@value='Add to cart']")).click();		
	}
}
