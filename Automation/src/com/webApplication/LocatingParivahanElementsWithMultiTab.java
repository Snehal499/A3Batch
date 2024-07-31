package com.webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingParivahanElementsWithMultiTab {
	public static void main(String[] args) {
		ChromeDriver parivan=new ChromeDriver();
		  parivan.manage().window().maximize();
		  parivan.get("https://parivahan.gov.in/parivahan/");
		 
		  parivan.switchTo().newWindow(WindowType.TAB);
		  parivan.get("https://parivahan.gov.in/parivahan/");
		  parivan.findElement(By.linkText("Sitemap")).click();
		  
		  parivan.switchTo().newWindow(WindowType.TAB);
		  parivan.get("https://vahan.parivahan.gov.in/nrservices/");
		  parivan.findElement(By.linkText("NR Services")).click();
		  
		  parivan.switchTo().newWindow(WindowType.TAB);
		  parivan.get("https://parivahan.gov.in/parivahan/en/contactus");
		  parivan.findElement(By.id("contact")).click();
		  
		  parivan.switchTo().newWindow(WindowType.TAB);
		  parivan.get("https://parivahan.gov.in/parivahan/en/contactus#");
		  parivan.findElement(By.linkText("Login")).
		  findElement(By.linkText("Vahan Login")).click();
	}
}

