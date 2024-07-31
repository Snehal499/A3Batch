package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingLocationOfWebElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		Point Loc = logo.getLocation();
		System.out.println(Loc);
		System.out.println("X : "+Loc.getX());
		System.out.println("Y : "+Loc.getY());
	}
}
