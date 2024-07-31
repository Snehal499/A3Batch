package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementsOfParivahan {
	public static void main(String[] args) {
		ChromeDriver parivan=new ChromeDriver();
		  parivan.manage().window().maximize();
		  parivan.get("https://parivahan.gov.in/parivahan/");
		  
		  parivan.findElement(By.linkText("Sitemap")).click();
		  parivan.findElement(By.linkText("NR Services")).click();
		  parivan.findElement(By.id("contact")).click();
		   
		  parivan.findElement(By.linkText("Login")).
		  findElement(By.linkText("Vahan Login")).click();
	}
}
