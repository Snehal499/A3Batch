package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickAndHoldwithRelease {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement Capital = driver.findElement(By.id("box6"));
		WebElement Country = driver.findElement(By.id("box106"));
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(Capital).release(Country).perform();  
		
		//actions.moveToElement(Capital).clickAndHold().moveToElement(Country).release().perform();
		//actions.clickAndHold(Capital).moveToElement(Country).release().perform();
		//actions.moveToElement(Capital).clickAndHold().release(Country).perform();
	}
}

        //build().perform() = create chain of actions + execute