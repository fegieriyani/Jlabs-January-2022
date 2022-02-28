package qaautomation.tugasqajlabs2022;

import org.testng.annotations.Test;

import qaautomation.tugasqajlabs2022.pages.LoginPageFactory;
import qaautomation.tugasqajlabs2022.pages.ProfilePageFactory;

import org.testng.Assert;

public class AppTestPageFactory extends BaseWebTest {

	@Test
	public void tugas() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);

		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginBtn();
		String actualText = profilePage.getProfileText();
		String expectedText = "You logged into a secure area";
		profilePage.clickLogoutBtn();
		String actualText2 = profilePage.getProfileText();
		String expectedText2 = "You logged out of the secure area!";
		System.out.println(actualText);
		System.out.println(actualText2);
		Assert.assertTrue(actualText.contains(expectedText));
		Assert.assertTrue(actualText2.contains(expectedText2));
	}

}

