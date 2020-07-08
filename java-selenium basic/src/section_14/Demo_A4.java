package section_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_A4 {
	public static WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void performActions() {
		driver.findElement(By.xpath(".//th[2]")).click();
		driver.findElement(By.xpath(".//th[2]")).click();
		List<WebElement> webElements = driver.findElements(By.xpath(".//tr/td[2]"));
		System.out.println(webElements.size());
		for (int i = 0; i < webElements.size(); i++) {
			String defaultText = webElements.get(i).getText();
			System.out.println(defaultText);
		}

		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < webElements.size(); i++) {
			array.add(webElements.get(i).getText());
		}
		System.out.println(array);
		ArrayList<String> arrayCopy = new ArrayList<String>();
		for (int i = 0; i < webElements.size(); i++) {
			arrayCopy.add(webElements.get(i).getText());
		}
		System.out.println(arrayCopy);

		Collections.sort(arrayCopy);
		Collections.reverse(arrayCopy);
		if (arrayCopy.equals(array)) {
			Reporter.log("Selection is Successful",true);
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

}
