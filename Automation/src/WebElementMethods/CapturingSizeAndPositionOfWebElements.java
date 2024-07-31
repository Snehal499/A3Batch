package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingSizeAndPositionOfWebElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		Rectangle rectangle = logo.getRect();
		System.out.println("width : " +rectangle.getWidth());
		System.out.println("Height:" +rectangle.getHeight());
		System.out.println("X : " +rectangle.getX());
		System.out.println("Y : " +rectangle.getY());
		
		System.out.println(rectangle.getDimension());
		System.out.println(rectangle.getPoint());
		
		System.out.println(rectangle.getClass());
		
	}
}
