package SelectClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPerformFirstSelectedOptionInDropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement Dropdown = driver.findElement(By.id("cars"));
		
		Select select=new Select(Dropdown);
		select.selectByIndex(2);
		select.selectByIndex(4);
		select.selectByIndex(0);
		System.out.println(select.getFirstSelectedOption().getText());
		//System.out.println(select.getFirstSelectedOption());   --- WebElement
	}
}