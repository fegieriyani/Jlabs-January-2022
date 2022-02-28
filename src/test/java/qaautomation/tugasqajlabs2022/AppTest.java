package qaautomation.tugasqajlabs2022;

import qaautomation.tugasqajlabs2022.pages.LoginPage;
import qaautomation.tugasqajlabs2022.pages.ProfilePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends BaseWebTest {
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);

	@Test
	public void tugas() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		String actualText = profilePage.getProfileText();
		String expectedText = "You logged into a secure area";
		profilePage.clickLogoutButton();
		String actualText2 = loginPage.getLoginText();
		String expectedText2 = "You logged out of the secure area!";
		System.out.println(actualText);
		System.out.println(actualText2);
		Assert.assertTrue(actualText.contains(expectedText));
		Assert.assertTrue(actualText2.contains(expectedText2));
	}
}
