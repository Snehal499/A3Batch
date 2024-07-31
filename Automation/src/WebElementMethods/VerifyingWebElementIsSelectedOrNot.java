package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingWebElementIsSelectedOrNot {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/lets-begin/indian-dating");
		
		driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		WebElement logo = driver.findElement(By.xpath("//input[@name='autologin']"));
		System.out.println(logo.isSelected());
	}

}
