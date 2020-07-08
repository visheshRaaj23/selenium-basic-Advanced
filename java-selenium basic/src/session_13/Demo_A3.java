package session_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		String Autotext = "";
		int count = 0;
		while (!Autotext.contains("BENGALURU INTERNATION AIRPORT")) {
			Thread.sleep(1000);
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			String fromJscript = "return document.getElementById(\"fromPlaceName\").value;";
			Autotext = (String) js.executeScript(fromJscript);
			System.out.println(Autotext);
			count++;
			if (Autotext.contains("BENGALURU INTERNATION AIRPORT")) {
				driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
			}
			if (count > 10) {
				System.out.println("Element is not Present");
				break;
			} else {
				System.out.println("Element is Present");
				break;
			}
		}

	}

}
