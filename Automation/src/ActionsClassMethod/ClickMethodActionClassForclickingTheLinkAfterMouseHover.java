package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethodActionClassForclickingTheLinkAfterMouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("wzrk-cancel")).click();
		
		Actions actions=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		actions.moveToElement(ele).perform();
		Thread.sleep(3000);    //important-NoSuchElementException
		WebElement link = driver.findElement(By.partialLinkText("Robotic Vacuum Cleaners"));
		actions.click(link).perform();
		
		//actions.moveToElement(link).click().perform();
		
		/*
		 * we can click n web element in two ways
		 */	
	}
}
