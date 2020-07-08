package section_12;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_A3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.navigate().to("https://www.path2usa.com/travel-companions");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		try {
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[id='Layer_1']")));
		//}
//		catch(Exception exception) {
//			System.out.println(exception);
//		}
		//finally {
			driver.findElement(By.cssSelector("svg[id='Layer_1']")).click();

			driver.findElement(By.cssSelector("input[name='travel_date']")).click();

			while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
					.contains("January")) {

				driver.findElement(By.xpath("(.//th[@class='next'])[1]")).click();

			}
			List<WebElement> listOfdays = driver.findElements(By.className("day"));

			int count = listOfdays.size();

			for (int i = 1; i < count; i++) {

				String date = driver.findElements(By.cssSelector("day")).get(i).getText();

				if (date.contains("23")) {
					driver.findElements(By.cssSelector("day")).get(i).click();
					break;
				}

			}
			
		}
		
		
		
		

	}


