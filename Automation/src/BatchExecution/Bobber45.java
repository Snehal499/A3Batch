package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bobber45 {
	@Test
	public void Bobber42() {
		Reporter.log("Bobber42 website launching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.jawamotorcycles.com/motorcycles/42-bobber");
		driver.quit();
	}
	
	@Test
	public void Jawa350() {
		Reporter.log("Jawa350 website launching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.jawamotorcycles.com/motorcycles/jawa-350");
		driver.quit();
	}

}
