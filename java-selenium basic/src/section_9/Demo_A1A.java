package section_9;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A1A {

	//Using Implicitly wait Condition
	//Using it inside main method
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		int j = 0;
		String[] neededItems = { "Cucumber", "Cauliflower", "Beans", "Apple", "Beetroot" };
		List<String> itemsNeededList = Arrays.asList(neededItems);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		List<WebElement> allItems = driver.findElements(By.xpath(".//div/h4"));
		for (int i = 0; i < allItems.size(); i++) {
			String[] seperatedBy = allItems.get(i).getText().split("-");
			String formattedItem = seperatedBy[0].trim();

			if (itemsNeededList.contains(formattedItem)) {
				j++;
				driver.findElements(By.xpath(".//div[@class='product-action']/button")).get(i).click();
			}

			if (j == neededItems.length) {
				break;
			}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		// check whether the field populated inside promocode is right validation or
		// not..
		Thread.sleep(5000);
		String text = driver.findElement(By.className("promoInfo")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();

	}

}
