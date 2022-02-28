package qaautomation.tugasqajlabs2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage {
	By profileText = By.xpath("//div[@id='flash']");
	By logoutBtn = By.xpath("//a[@class='button secondary radius']");

	public ProfilePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public String getProfileText() {
		return getText(profileText);
	}
	
	public void clickLogoutButton() {
		clickAndWait(logoutBtn);
	}
}

