package CapturingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaturingScreenshotsOfAllWebPage {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);
		//File dest=new File("C:\\Users\\TUF GAMING\\Desktop\\image.png");
		File dest=new File("C:\\Users\\TUF GAMING\\Desktop\\Selenium\\Selenium Projects\\Automation\\Screenshot\\image.png");
		FileHandler.copy(Screenshot, dest);
	}
}
