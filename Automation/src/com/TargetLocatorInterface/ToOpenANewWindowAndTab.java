package com.TargetLocatorInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenANewWindowAndTab {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the web app
		driver.get("https://yamaha-motor.com/");
		
		//to open new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myflowertree.com/");
		
		//to open new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nestle.in/");
		driver.get("https://cadburygifting.in/");
		driver.close();   //to close that tab or window
		
		driver.quit();    //to close all
	}
}
