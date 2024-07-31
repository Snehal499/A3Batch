package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandAxes {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/TUF%20GAMING/Desktop/XpathAxes.html");
		
		String text1=driver.findElement(By.xpath("//div[@class='Mammals']/parent::div")).getText();
		String text2=driver.findElement(By.xpath("//div[@class='Mammals']/child::div[@class='carnivors']")).getText();
		String text3=driver.findElement(By.xpath("//div[@class='Mammals']/descendant::div")).getText();	
		String text4=driver.findElement(By.xpath("//div[@class='Mammals']/ancestor::div")).getText();
		String text5=driver.findElement(By.xpath("//div[@class='Mammals']/preceding-sibling::div")).getText();
		String text6=driver.findElement(By.xpath("//div[@class='Mammals']/following-sibling::div")).getText();
		
		System.out.println("Parent :"+text1);
		System.out.println("Child :"+text2);
		System.out.println("Decendant :"+text3);
		System.out.println("Ancestor :"+text4);
		System.out.println("Preceding-sibling :"+text5);
		System.out.println("Followin-sibling :"+text6);
	}
}
