package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateConfirmationPopupInLIC {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://licindia.in/web/guest/careers");
		driver.findElement(By.partialLinkText("Pay Premium")).click();
		
		Alert alert=driver.switchTo().alert();
		String info = alert.getText();
		System.out.println(info);
		Thread.sleep(2000);
		
		//alert.accept();   //Press on OK
		alert.dismiss();    //Press on Cancle	
	}
}
