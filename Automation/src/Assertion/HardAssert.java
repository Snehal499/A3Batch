package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {   // for critical - stop execution where script fail

	@Test
	public void LoginInDWS() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedTitle="Demo WEb Shop:";
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Title Verification at WelcomePage");
		driver.findElement(By.partialLinkText("Log in")).click();
	}
}
