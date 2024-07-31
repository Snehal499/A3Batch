package TestScript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUnits.BaseClass;

@Listeners(GenericUnits.BaseClass.class)
public class DWSTC002 extends BaseClass {
	
	@Test
	public void testcase() {
	//driver.findElement(By.id("login")).click();  // wrong id to fail the testcase & use OnTestFailure method
	Assert.fail();  // used to fail our test Case
	}
}
