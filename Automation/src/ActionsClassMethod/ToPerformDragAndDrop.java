package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement Capital = driver.findElement(By.id("box6"));
		WebElement Country = driver.findElement(By.id("box106"));
		//WebElement Capital2 = driver.findElement(By.id("box5"));
		//WebElement Country2 = driver.findElement(By.id("box105"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(Capital, Country).perform();
		
		//actions.dragAndDrop(Capital2, Country2).perform();
	}
}
