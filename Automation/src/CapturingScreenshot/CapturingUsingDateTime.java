package CapturingScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingUsingDateTime {
	public static void main(String[] args) throws IOException {
		LocalDateTime Idt=LocalDateTime.now();
		String time=Idt.toString().replace(":","-");
		//System.out.println(time);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\image"+time+".png1");
		FileHandler.copy(Screenshot, dest);
	}

}
