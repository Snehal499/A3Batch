package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformActionsDragAndDropForAllEle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actions = new Actions(driver);
		
		int i=1;
		do{
			WebElement Capital = driver.findElement(By.id("box"+ i));
			WebElement Country = driver.findElement(By.id("box10"+ i));
			actions.dragAndDrop(Capital, Country).perform();
			i++;
		}while(i<=7);	
	}
}
