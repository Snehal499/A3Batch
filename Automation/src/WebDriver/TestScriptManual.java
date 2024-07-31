package WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUnits.BaseClass;

public class TestScriptManual extends BaseClass{
	@Test
	public void VerifyAProductCanBe_AddedToCart() {
		bp.getElectonicsLink().click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.partialLinkText("Smartphone")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
}

