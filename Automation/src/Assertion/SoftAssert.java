package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void LoginInDWS() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert sa = new SoftAssert();
		
		String expectedTitle="Demo WEb Shop:";
		String expectedLoginPageTitle="Demo Web Shop. Login";
		String actualTitle= driver.getTitle();
		String actualLoginPageTitle=driver.getTitle();
		
		driver.findElement(By.partialLinkText("Log in")).click();
	}
}
