package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterInDemoWebShop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys();
		driver.findElement(By.id("LastName")).sendKeys();
		driver.findElement(By.id("Email")).sendKeys();
		driver.findElement(By.id("Password")).sendKeys();
		driver.findElement(By.id("ConfirmPassword")).sendKeys();
		driver.findElement(By.id("register-button")).click();	
		
		driver.quit();
	}
}
