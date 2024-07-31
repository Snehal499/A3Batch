package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformRightClickOnTextBoxUsingActionsContextClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Actions actions=new Actions(driver);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		actions.contextClick(emailTextBox).perform();
		
		//actions.moveToElement(emailTextBox).contextClick().perform();
	}
}
