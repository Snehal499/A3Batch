package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingColourAndTextOfErrorMessage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("Admin",Keys.TAB);
		
		WebElement ErrorMsg = driver.findElement(By.xpath("//span[@data-valmsg-for='Email']"));
		System.out.println(ErrorMsg.getText());
		System.out.println(ErrorMsg.getCssValue("color"));
	}
}
