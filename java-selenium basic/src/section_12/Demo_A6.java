package section_12;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Demo_A6 {

	// Building auto suggestive drop down for KSRTC.in application

	@FindBy(name = "fromPlaceName")
	public WebElement fromPlaceNameInputField;

	@FindBy(name = "toPlaceName")
	public WebElement toPlaceInputField;

	@FindBy(name = "txtJourneyDate")
	public WebElement selectdate;

	@FindBy(xpath = "//a[contains(@class,'ui-state-active')]")
	public WebElement selectCurrentDateFromCalendarWindow;

	@FindBy(xpath = "//input[@name='singleLady']")
	public WebElement checkBoxElement;

	@FindBy(xpath = "//div/button[contains(@class,'btn-booking')]")
	public WebElement searchBusButton;

	public Demo_A6(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void entersource(String source, WebDriver driver, String actualSource) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		this.fromPlaceNameInputField.sendKeys(source);
		Thread.sleep(3000);
		this.fromPlaceNameInputField.sendKeys(Keys.DOWN);
		this.fromPlaceNameInputField.sendKeys(Keys.DOWN);
		while (!fromPlaceNameInputField.getAttribute("value").equalsIgnoreCase(actualSource)) {
			this.fromPlaceNameInputField.sendKeys(Keys.DOWN);
		}
		this.fromPlaceNameInputField.sendKeys(Keys.RETURN);
		this.fromPlaceNameInputField.sendKeys(Keys.TAB);

	}

	public void enterdestination(String dest, WebDriver driver, String ActualDestination) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		this.toPlaceInputField.sendKeys(dest);
		Thread.sleep(3000);
		this.toPlaceInputField.sendKeys(Keys.DOWN);
		this.toPlaceInputField.sendKeys(Keys.DOWN);
		while (!toPlaceInputField.getAttribute("value").equalsIgnoreCase(ActualDestination)) {
			this.toPlaceInputField.sendKeys(Keys.DOWN);
		}
		this.toPlaceInputField.sendKeys(Keys.RETURN);
		this.toPlaceInputField.sendKeys(Keys.TAB);

	}

	public void selectCurrentDate() {
		selectCurrentDateFromCalendarWindow.click();
	}

	public void selectSingleLadyCheckBox(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(checkBoxElement).click().build().perform();
	}

	public void clickButton() {
		searchBusButton.click();
	}
	public void validateTabsTitle(WebDriver driver,String actualTitle) {
		String pageTitle = driver.getTitle();
		if(pageTitle.contains(actualTitle)) {
			Reporter.log("Test is Pass",true);
		} else {
			Reporter.log("Test is fail",true);
			Assert.assertFalse(true);
		}
		
	}
}
