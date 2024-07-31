package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogicOfProgram {
	
	public static void main(String[] args) {
		
	}

	public static void LauchBrowser(String bname) {
		WebDriver driver=null;
		
		if(bname.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(bname.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		
	}
}


