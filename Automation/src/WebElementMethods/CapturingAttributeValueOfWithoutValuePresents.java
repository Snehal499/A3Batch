package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingAttributeValueOfWithoutValuePresents {
	public static void main(String[] args) {
		WebDriver Shadi=new ChromeDriver();
		Shadi.manage().window().maximize();
		Shadi.get("https://demowebshop.tricentis.com/login");
		
		WebElement Attribute = Shadi.findElement(By.id("Email"));
		Attribute.sendKeys("Snehal");
		System.out.println(Attribute.getAttribute("value"));
	}
}
