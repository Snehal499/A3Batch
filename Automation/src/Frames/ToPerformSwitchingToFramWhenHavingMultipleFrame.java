package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSwitchingToFramWhenHavingMultipleFrame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.get("https://www.speedtest.net/");
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.switchTo().frame(4);
		driver.findElement(By.id("cbb")).click();	
	}
}
