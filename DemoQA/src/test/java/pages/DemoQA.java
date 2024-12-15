package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public DemoQA(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@FindBy(xpath = "//h5[contains(text(),'Forms')]")
	WebElement forms;

	public void clcikForms() {

		// Scroll the element into view
		js.executeScript("arguments[0].scrollIntoView(true);", forms);
		wait.until(ExpectedConditions.elementToBeClickable(forms)).click();
	}

	@FindBy(xpath = "//span[text()=\"Practice Form\"]")
	WebElement practiceform;

	public void clcikpracticeform() {
		wait.until(ExpectedConditions.elementToBeClickable(practiceform)).click();
	}

}
