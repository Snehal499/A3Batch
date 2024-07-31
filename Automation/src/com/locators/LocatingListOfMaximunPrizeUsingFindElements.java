package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingListOfMaximunPrizeUsingFindElements {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15",Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB) - Black')]/../../../..//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB) - Blue')]/../../../..//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB) - Pink')]/../../../..//button[text()='Add to cart']")).click();
		driver.findElement(By.partialLinkText("Cart")).click();
		
		List<WebElement> AllPricesElements =driver.findElements(By.xpath("//span[@class='currencyINR']"));
		for(WebElement PriceEle:AllPricesElements) {
			System.out.println(PriceEle.getText());
		}
	}
}
