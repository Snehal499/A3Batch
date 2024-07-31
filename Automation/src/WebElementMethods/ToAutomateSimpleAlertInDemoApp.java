package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAutomateSimpleAlertInDemoApp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
		
		Actions actions =new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		actions.contextClick(search).click().perform();          
		
		Alert alert = driver.switchTo().alert();
		String Info = alert.getText();           
		System.out.println(Info);
		                       
		alert.accept();    // Press On OK Button                      
	}
}
