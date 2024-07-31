package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingAttributeValueOfWE {
	public static void main(String[] args) {
		WebDriver Shadi=new ChromeDriver();
		Shadi.manage().window().maximize();
		Shadi.get("https://www.shaadi.com/");
		
		WebElement Attri = Shadi.findElement(By.xpath("//img[@data-testid='shaadi_logo']"));
		String value = Attri.getAttribute("Title");
		System.out.println(value);
	}
}