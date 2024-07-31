package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUnits.BaseClass;

public class TestScript001 extends BaseClass {
	@Test
	public void executeScript1() {
		Reporter.log("ExecuteScript1", true);
	}
}
