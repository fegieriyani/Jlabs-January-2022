package qaautomation.tugasqajlabs2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage{
	
	By username = By.xpath("//input[@id='login']");
	By arrowBtn = By.xpath("//i[@class='material-icons-outlined f36']");

	public DashboardPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void dashboard(String user, String pass) {
		setText(username, user);
		clickAndWait(arrowBtn);
	}

	public void inputUsername(String user) {
		setText(username, user);
	}

	public void clickArrowButton() {
		clickAndWait(arrowBtn);
	}

}
