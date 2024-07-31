package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithPartialLinkTextAttribute {
	public class LocatingAnElementsForSkillRary {
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.skillrary.com/");
			driver.findElement(By.partialLinkText(" English ")).click();
		}
	}

}
