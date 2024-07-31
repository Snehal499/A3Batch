package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseSendKeysOfActionOnGoogleMap {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/maps/");
		WebElement TextBox = driver.findElement(By.name("q"));
		
		Actions actions=new Actions(driver);
		actions.sendKeys(TextBox, "Baner Gaon").perform();
		//actions.moveToElement(TextBox).sendKeys("Baner Gaon").perform();
		actions.keyDown(Keys.ENTER).perform();
		actions.keyUp(Keys.ENTER).perform();	
	}
}
