package qaautomation.tugasqajlabs2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	By homeText = By.xpath("//div[@class='bname']");
	By listUser = By.xpath("//span[normalize-space()='AHA eLearning']");

	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public String getHomeText() {
		return getText(homeText);
	}
	
	public void clickListUser() {
		clickAndWait(listUser);
	}
	
	public void openNewFrame() {
		driver.get().switchTo().frame("ifmail");
	}

	public void runJavaScriptCommand(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript(script);
	}

	public void acceptAlert() {
		driver.get().switchTo().alert().accept();
	}

}
