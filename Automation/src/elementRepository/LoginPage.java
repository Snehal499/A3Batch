package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericUnits.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(partialLinkText = "Log in")
	private WebElement LoginLink;

	@FindBy(id="Email")
	private WebElement EmailTextBox;
	
	@FindBy(id="Password")
	private WebElement PasswordTextBox;
	
	@FindBy(id="RememberMe")
	private WebElement rememberMeCheckBox;
	
	@FindBy(partialLinkText = "Forgot password?")
	private WebElement ForgetPasswordLink;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;
	

	public WebElement getLoginLink() {
		return LoginLink;
	}
	
	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getForgetPasswordLink() {
		return ForgetPasswordLink;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
}
