package CapturingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotsOfWebElements {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
	    WebElement Logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		File Screenshot = Logo.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\logo.png"); 
		FileHandler.copy(Screenshot, dest);
	}

}
