package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleChildWindowPopupInSBI {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String parentWindowID = driver.getWindowHandle();
		
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowID);
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextStep")).click();
		driver.findElement(By.id("userName")).sendKeys("snehal");
		driver.findElement(By.id("accountNo")).sendKeys("123456789123");
		driver.findElement(By.id("mobileNo")).sendKeys("9730508075");
		driver.findElement(By.name("captchaValue")).sendKeys("8EF2");
		driver.findElement(By.id("go")).click();		         
	}
}
