package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUnits.BaseClass;

public class TestScript002 extends BaseClass {
	@Test
	public void executeScript2(){
		Reporter.log("ExecuteScript2", true);
	}
}