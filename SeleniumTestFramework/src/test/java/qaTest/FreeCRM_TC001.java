package qaTest;

import org.testng.annotations.Test;

import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import baseSetup.BaseTest;
import utilities.ElementsFetch;


public class FreeCRM_TC001 extends BaseTest {
	ElementsFetch ele = new ElementsFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
	
	@Test
	public void LaunchHomePage() throws InterruptedException {
		homePage.NavigateToPages();
	}

}
