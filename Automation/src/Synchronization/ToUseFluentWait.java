package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToUseFluentWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		FluentWait<WebDriver> FluentWait=new FluentWait<WebDriver>(driver);
		FluentWait.pollingEvery(Duration.ofMillis(250));
		FluentWait.ignoring(NoSuchElementException.class);
		
		driver.get("https://www.shoppersstack.com/products_page/30");
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		
		FluentWait.withTimeout(Duration.ofSeconds(15));
		FluentWait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		driver.findElement(By.id("Check")).click();	
	}
}
