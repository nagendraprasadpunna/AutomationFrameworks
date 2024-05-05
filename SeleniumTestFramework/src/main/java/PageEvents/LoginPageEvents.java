package PageEvents;

import org.openqa.selenium.WebElement;

import org.testng.Assert;

import PageObjects.LoginPageElements;
import baseSetup.BaseTest;
import utilities.ElementsFetch;

public class LoginPageEvents extends BaseTest {
	
	ElementsFetch ele = new ElementsFetch();
	
	public void verifyIfLoginPageLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.LoginButton_Xpath).size()>0,"Element Not Found");
	}
	
	public void signInButton() {
		
		WebElement Login_Element = ele.getWebElement("XPATH", LoginPageElements.LoginButton_Xpath);
		Login_Element.click();
	}
	
	public void enterCredentials() {
		WebElement email_Element = ele.getWebElement("XPATH", LoginPageElements.EmailField_Xpath);
		WebElement password_Element = ele.getWebElement("XPATH", LoginPageElements.PasswordField_Xpath);
		email_Element.sendKeys("test@test.com");
		password_Element.sendKeys("1234");
		WebElement signIn_Element = ele.getWebElement("XPATH", LoginPageElements.PasswordField_Xpath);
		signIn_Element.click();
	}

}
