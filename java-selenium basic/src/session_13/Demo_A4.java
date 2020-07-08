package session_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@id='autocomplete']")).sendKeys("United");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		String autoText = "";
		int count = 0;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (!autoText.equalsIgnoreCase("United Kingdom")) {
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			autoText = "return document.getElementById(\"autocomplete\").value;";
			autoText = (String) js.executeScript(autoText);
			if (autoText.equalsIgnoreCase("United Kingdom")) {
				driver.findElement(By.xpath(".//input[@id='autocomplete']")).sendKeys(Keys.ENTER);
			}
			if (count > 0) {
				System.out.println("Test is Failed");
				break;
			} else {
				System.out.println("Test is Passed");
				break;
			}
		}

	}

}
