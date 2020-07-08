package section_8;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_A8 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.cleartrip.com/");
		Thread.sleep(1000);
		WebElement roundTrip = driver.findElement(By.xpath(".//input[@type='radio' and @id='RoundTrip']"));
		roundTrip.click();
		Thread.sleep(2000);
		if (roundTrip.isEnabled()) {
			System.out.println("Test is Pass");
			System.out.println("RoundTrip is Selected");
		} else {
			System.out.println("Test is Failed");
		}
		driver.findElement(By.xpath(".//input[@id='FromTag']")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		List<WebElement> autoSuggestSource = driver.findElements(By.xpath("//ul[@class='autoComplete']/li"));
		int count = autoSuggestSource.size();
		System.out.println(count);
		for (WebElement element : autoSuggestSource) {
			String text = element.getText();
			System.out.println(text);
		}
		autoSuggestSource.get(0).click();
		driver.findElement(By.xpath(".//input[@id='ToTag']")).sendKeys("Mumbai");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath(".//ul[@class='autoComplete']/li/a[@id='ui-id-14']")));
		driver.findElement(By.xpath(".//input[@id='ToTag']")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Sat, 30 Nov, 2019");
		driver.findElement(By.id("ReturnDate")).sendKeys(Keys.ENTER);
		Select selectAdults = new Select(driver.findElement(By.xpath(".//select[@id='Adults']")));
		selectAdults.selectByValue("4");
		Select selectChild = new Select(driver.findElement(By.xpath(".//select[@id='Childrens']")));
		selectChild.selectByIndex(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//div/p/a[@id='MoreOptionsLink']")).click();
		Select selectClassOfTravel = new Select(driver.findElement(By.xpath(".//select[@name='class']")));
		selectClassOfTravel.selectByVisibleText("Business");
		driver.findElement(By.xpath(".//input[@name='airline']")).sendKeys("indigo");
		WebDriverWait waitFor = new WebDriverWait(driver, 10);
		waitFor.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//ul[@id='ui-id-3']/li/a")));
		driver.findElement(By.xpath(".//input[@name='airline']")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#SearchBtn")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath(".//div[@id='homeErrorMessage']")).isDisplayed()) {
			System.out.println("Test is failed");
		} else {
			System.out.println("Test is pass");
		}

	}

}
