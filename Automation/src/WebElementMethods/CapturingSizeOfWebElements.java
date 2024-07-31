package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingSizeOfWebElements {
	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.meesho.com/");
			
		    WebElement Logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
			Dimension size = Logo.getSize();
			System.out.println(size);
			System.out.println("Width :"+size.getWidth());
			System.out.println("Height :"+size.getHeight());	
	}
}
