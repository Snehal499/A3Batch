package TestScript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import GenericUnits.BaseClass;

public class DWSTC001 extends BaseClass{
	@Test
	public void VerifyAProductCanBe_AddedToCart() {
		bp.getElectonicsLink().click();
		ep.getCellPhoneLink().click();;
		WebElement A = ep.getSmartPhoneLink();
		ep.getSmartPhoneLink().click();
		ep.getAddToCartButton().click();
		bp.getShoppingLink().click();
		WebElement E = sp.getSmartphoneLink();
		
		assertEquals(A, E);
	}
}

