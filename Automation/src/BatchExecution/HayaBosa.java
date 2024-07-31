package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HayaBosa {
	
	@Test
	public void launchingHayaBusaSite() {
		Reporter.log("HayaBusa website launching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		driver.quit();
	}

}
