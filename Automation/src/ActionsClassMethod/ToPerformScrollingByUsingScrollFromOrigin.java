package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToPerformScrollingByUsingScrollFromOrigin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Actions action=new Actions(driver);
		WebElement ResumeWriting = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		action.scrollFromOrigin(ScrollOrigin.fromElement(ResumeWriting), 0, 200).perform();	
	}
}
