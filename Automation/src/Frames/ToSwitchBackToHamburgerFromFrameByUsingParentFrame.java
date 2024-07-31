package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToHamburgerFromFrameByUsingParentFrame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.get("https://www.dream11.com/");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("send-sms-iframe");
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("9786423587");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();	
	}
}
