package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToPerformAllMouseAndKeyboardActionsOnTheIntershala {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://internshala.com/");
		WebElement Internship = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle internship_link']"));
		WebElement Profile = driver.findElement(By.xpath("//span[contains(text(),'Top Locations')]"));
		
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(Internship).perform();
		Thread.sleep(3000);
		actions.click(Profile).perform();
		WebElement WFH = driver.findElement(By.xpath("//a[text()='Work from Home']"));
		actions.click(WFH).perform();
		actions.click(driver.findElement(By.id("no_thanks"))).perform();
		
		actions.scrollByAmount(0,1000).perform();
		WebElement Recruitment = driver.findElement(By.xpath("//h3[contains(text(),'Recruitment')]"));
		actions.scrollToElement(Recruitment).perform();
		actions.scrollFromOrigin(ScrollOrigin.fromElement(Recruitment), 0, 200).perform();
		actions.click(Recruitment).perform();
		Thread.sleep(3000);
		
		String ParentWindowId=driver.getWindowHandle();
		driver.switchTo().window(ParentWindowId);
		WebElement slider = driver.findElement(By.xpath("//input[@class='slider']"));
		actions.dragAndDropBy(slider, 6, 0).perform();
		Thread.sleep(3000);
		
		// keayboard Actions
		WebElement search = driver.findElement(By.xpath("//input[@id='keywords']"));
		actions.sendKeys(search,"Sales").perform();
		actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		//actions.moveToElement(slider).dragAndDropBy(slider, 20, 0).perform();
	}

}
