package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BMW {
	@Parameters("bname")    
	@Test
	public void bmw (@Optional("chrome") String browserName) {     
		WebDriver driver=null;   // non static default value is null(String, array)
		if (browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			Reporter.log("Invalid Browser Name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bmwusa.com/");
		driver.quit();	
	}
}
