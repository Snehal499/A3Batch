package com.getInput;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetInputOfBrowser { //RunTime Polymorphism

	public static void main(String[] args) {
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("****Enter Browser Name****");
			String browser = sc.next();
			
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriver driver=new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				WebDriver driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				WebDriver driver=new EdgeDriver();
			}
			else {
				System.out.println("Invalid Browser");
			}
		}
	}
}
