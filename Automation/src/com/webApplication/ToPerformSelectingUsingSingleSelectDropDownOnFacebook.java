package com.webApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPerformSelectingUsingSingleSelectDropDownOnFacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement YearDropDown = driver.findElement(By.id("year"));
		
		Select select=new Select(YearDropDown);
		System.out.println(select.isMultiple());
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("2022");
		Thread.sleep(3000);
		select.selectByVisibleText("2015");
		Thread.sleep(3000);	

		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		for(WebElement option:options) {
			//select.selectByValue(option.getAttribute("value"));
			//Thread.sleep(3000);
			select.selectByVisibleText(option.getText());
		}
	}

}
