package section_8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//Handling Dynamic Dropdowns
public class Demo_A2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.spicejet.com");
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
		driver.findElement(By.xpath("(.//input[@value='RoundTrip'])[1]")).click();
		Thread.sleep(1000);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1") == true) {
			System.out.println("Radio button (Round Trip) is enabled");
			Assert.assertTrue(true);

		} else {
			Assert.assertFalse(false);
			System.out.println("Test is failed");
		}
		Demo_A2.getSource(driver);
		Thread.sleep(2000);
		Demo_A2.getDestination(driver);
		Thread.sleep(1000);
		Demo_A2.select_CurrentDate(driver);

	}

	public static void getSource(WebDriver driver) {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		WebElement source = driver.findElement(By.xpath(".//a[@value='BLR']"));
		source.click();
	}

	public static void getDestination(WebDriver driver) {
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		WebElement destination = driver.findElement(By.xpath("(.//a[@value='GOI'])[2]"));
		destination.click();
	}

	public static void select_CurrentDate(WebDriver driver) {
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println("Test is Pass");
		driver.close();
	}

}
