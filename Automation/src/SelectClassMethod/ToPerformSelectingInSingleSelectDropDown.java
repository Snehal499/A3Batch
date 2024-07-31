package SelectClassMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPerformSelectingInSingleSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		
		Select select=new Select(monthDropdown);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByValue("8");
		Thread.sleep(3000);
		select.selectByVisibleText("Jan");
		
		System.out.println(select.isMultiple());
		
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		
		for(WebElement option:options) {
			//System.out.println(option);
			System.out.println(option.getText());
			System.out.println(option.getAttribute("value"));
		}
	}
}
