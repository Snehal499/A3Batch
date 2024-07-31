package com.webApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnFlipkartImageWithCssSelector {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver flipkart=new ChromeDriver();
		flipkart.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		flipkart.manage().window().maximize();
		flipkart.get("https://www.flipkart.com/");
		
		flipkart.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER);
		//flipkart.findElement(By.partialLinkText("Mobiles")).click();
		//Thread.sleep(5000);
		flipkart.findElement(By.cssSelector("img[alt='Apple iPhone 15 (Green, 128 GB)']")).click();	
	}
}
