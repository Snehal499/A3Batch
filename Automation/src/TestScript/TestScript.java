package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUnits.BaseClass;

public class TestScript extends BaseClass {
	@Test()
	public void executeScript1(){
		Reporter.log("ExecuteScript1", true);
	}

	@Test
	public void executeScript2(){
		Reporter.log("ExecuteScript2", true);
	}
}
