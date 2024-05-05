package PageEvents;

import org.openqa.selenium.WebElement;

import PageObjects.HomePageElements;
import baseSetup.BaseTest;
import org.testng.Assert;
import utilities.ElementsFetch;
import utilities.WebActions;

public class HomePageEvents extends BaseTest {
	
	public void NavigateToPages() throws InterruptedException {
		ElementsFetch ele = new ElementsFetch();
		WebElement About_Element = ele.getWebElement("XPATH", HomePageElements.xpath_About);
		WebElement pricing_Element = ele.getWebElement("XPATH", HomePageElements.xpath_Pricing);
		WebElement support_Element = ele.getWebElement("XPATH", HomePageElements.xpath_Support);

		String About_ActualText = About_Element.getText().toString();
		//Validate the Text
		WebActions.verifyOnRightPage(About_ActualText,"ABOUT");
		About_Element.click();
		//driver.wait(2000);
		//pricing_Element.click();
		//support_Element.click();

	}


	
}
