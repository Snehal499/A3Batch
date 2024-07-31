package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperAttributeOfTestAnnotation {
	
	@Test(enabled = false)     //disable method
	public void HayaBusaSite() {
		Reporter.log("HayaBusa website launching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		Assert.fail();       // use to fail TestCase/Method
		driver.quit();
		}
	
		@Test(invocationCount = 3 , threadPoolSize=2) //Multiple Launch with Parallel Execution
		public void Bobber42() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.jawamotorcycles.com/motorcycles/42-bobber");
			driver.quit();
		}
		
		@Test(timeOut = 8000)     //Independent Method
		public void R15Site() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
			driver.quit();
		}
		
		@Test(dependsOnMethods="HayaBusaSite")  //depend on another Method
		public void R15() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
			driver.quit();
		}
}
