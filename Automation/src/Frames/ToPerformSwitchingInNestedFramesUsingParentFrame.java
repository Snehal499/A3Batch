package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSwitchingInNestedFramesUsingParentFrame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		String Parent = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		
		driver.switchTo().frame(0);
		String Child = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(Child);
		
		driver.switchTo().parentFrame();
		System.out.println(Parent);
		
		driver.switchTo().defaultContent();
		driver.quit();
	}
}
