package WebElementMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopupInAssignmentQue1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/TUF%20GAMING/Downloads/Assessment1.html");
		driver.findElement(By.xpath("//button[text()=' Click Me !!!']")).click();
		
		Set<String> allWindowID = driver.getWindowHandles();
		//System.out.println(allWindowID);
		for(String windowId:allWindowID) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("BurgerKing")) {
				break;
			}
		}
		driver.manage().window().maximize();
		driver.quit();
	}
}
