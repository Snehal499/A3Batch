package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUnits.BaseClass;

@Listeners(defaultPackage.OnTestFailureListener.class)
public class TC001 extends BaseClass {    
	@Test
	public void tc() {                //When we don't have framework of Base Class
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("Register")).click();	
	}
}
