package section_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_A7 {

	public static WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ksrtc.in/oprs-web/");
	}

	@Test
	public void bookATickets() throws InterruptedException {
		Demo_A6 demo = new Demo_A6(driver);
		demo.entersource("UDU", driver,"Udupi");
		Thread.sleep(3000);
		demo.enterdestination("Beng", driver,"Bengaluru");
		Thread.sleep(2000);
		demo.selectCurrentDate();
		demo.selectSingleLadyCheckBox(driver);
		demo.clickButton();
		Thread.sleep(3000);
		demo.validateTabsTitle(driver, "Official Website");
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
