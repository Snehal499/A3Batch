package defaultPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class OnTestFailureListener implements ITestListener {
	
	public static WebDriver driver;   // static so it will create same variable for all object 

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\screenshot.png");
		try {
			FileHandler.copy(src, dest);
		}
		catch (IOException e) {
			
		}
	}
}
