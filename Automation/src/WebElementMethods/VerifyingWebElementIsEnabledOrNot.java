package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingWebElementIsEnabledOrNot {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		
		WebElement logo = driver.findElement(By.xpath("//button[@data-testid='lets_begin']"));
		System.out.println(logo.isEnabled());
	}

}
