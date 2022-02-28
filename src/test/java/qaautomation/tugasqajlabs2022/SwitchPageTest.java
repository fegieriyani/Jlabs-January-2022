package qaautomation.tugasqajlabs2022;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.tugasqajlabs2022.pages.DashboardPage;
import qaautomation.tugasqajlabs2022.pages.HomePage;

public class SwitchPageTest extends BaseWebTestSwitch {
	HomePage homePage = new HomePage(driver, explicitWait);
	DashboardPage dashboardPage = new DashboardPage(driver, explicitWait);

	@Test
	public void tugasSwitching() {
		String username = "testautomation";
		
		dashboardPage.inputUsername(username);
		dashboardPage.clickArrowButton();
		String actualText = homePage.getHomeText();
		String expectedText = "testautomation@yopmail.com";
		homePage.openNewFrame();
		System.out.println(actualText);
		Assert.assertTrue(actualText.contains(expectedText));
	}
}