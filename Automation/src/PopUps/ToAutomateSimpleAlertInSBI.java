package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAutomateSimpleAlertInSBI {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		Actions actions =new Actions(driver);
		actions.contextClick().perform();         //click on the corner of the Webpage 
		
		Alert alert = driver.switchTo().alert();
		String Info = alert.getText();            // Capturing info in alert
		System.out.println(Info);
		Thread.sleep(3000);                       // wait so we can see Popup
		
		alert.accept();                           // press on OK
		//alert.dismiss();                        // press on OK if only present
	}
}
