package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateConfirmationPopupInOmayoBlogspot {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		
		Alert alert = driver.switchTo().alert();
		String info = alert.getText();
		System.out.println(info);
		alert.accept();
		//alert.dismiss();
	}
}
