package section_10;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_A1 {

	static WebDriver driver;
	static int j = 0;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	//Using Explicitly wait function
	public static void main(String[] args) throws InterruptedException {
		String[] itemsNeeded = { "Cucumber", "Cauliflower", "Beans", "Apple", "Beetroot" };
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait wait = new WebDriverWait(driver, 7);
		Demo_A1.performOperation(driver, itemsNeeded, wait);

	}

	public static void performOperation(WebDriver driver, String[] itemsNeeded, WebDriverWait wait)
			throws InterruptedException {
		List<String> listOfItems = Arrays.asList(itemsNeeded);
		List<WebElement> elementsList = driver.findElements(By.xpath(".//div/h4"));
		int count = elementsList.size();
		System.out.println(count);
		for (int i = 0; i < elementsList.size(); i++) {
			String[] sepElement = elementsList.get(i).getText().split("-");
			String formattedElement = sepElement[0].trim();
			if (listOfItems.contains(formattedElement)) {
				j++;
				driver.findElements(By.xpath(".//div[@class='product-action']/button")).get(i).click();
			}
			if (j == itemsNeeded.length) {
				break;
			}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		// check whether the field populated inside promocode is right validation or not..
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		String text = driver.findElement(By.className("promoInfo")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
		System.out.println("Test is Pass");

	}

}
