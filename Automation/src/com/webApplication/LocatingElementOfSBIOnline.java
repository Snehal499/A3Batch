package com.webApplication;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementOfSBIOnline {
    public static void main(String[] args) {
		ChromeDriver SBI=new ChromeDriver();
		SBI.manage().window().maximize();
		
		SBI.get("https://retail.onlinesbi.sbi/retail/login.htm");
		SBI.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		SBI.findElement(By.linkText("Forgot Username / Login Password")).click();
		
		String parentWindowId=SBI.getWindowHandle();
		
		SBI.switchTo().newWindow(WindowType.WINDOW);  //Extra for switch window
		SBI.get("https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0");
		
		Set<String> allwindowId=SBI.getWindowHandles();
		//System.out.println(allwindowId);
		allwindowId.remove(parentWindowId);
		
		for(String windowId:allwindowId) {
		   SBI.switchTo().window(windowId);
		}
		
		SBI.findElement(By.id("nextStep")).click();
		SBI.findElement(By.id("userName")).sendKeys("Snehal");
		SBI.findElement(By.id("accountNo")).sendKeys("77331078950");
		SBI.findElement(By.id("mobileNo")).sendKeys("9730508075");
		SBI.findElement(By.id("datepicker5")).sendKeys("04/07/1999");
		SBI.findElement(By.name("captchaValue")).sendKeys("893FD");
		
		SBI.findElement(By.id("go")).click();
    }
}
