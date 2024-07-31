package TestNG;

import org.testng.annotations.Test;

public class ForTestNG {
	@Test
	public void Test(int a) {
		int b=10;
		a=b;
		System.out.println(a);
	}
}