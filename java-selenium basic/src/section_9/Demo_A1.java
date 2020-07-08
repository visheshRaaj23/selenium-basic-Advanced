package section_9;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//E-Commerce Website adding array of items to the cart,Code Optimization to it.
//Debugging it.
//Donot use Text function in xpath
//Add to cart is dynamic.
public class Demo_A1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		int j = 0;
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot", "Apple", "Banana" };

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allProducts = driver.findElements(By.xpath(".//div/h4"));
		System.out.println(allProducts.size());
		Thread.sleep(1000);
		for (int i = 0; i < allProducts.size(); i++) {

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			String[] seperatedName = allProducts.get(i).getText().split("-");
			String formattedName = seperatedName[0].trim();
			System.out.println(seperatedName);
			System.out.println(formattedName);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath(".//div[@class='product-action']/button")).get(i).click();
			}
			if (j == itemsNeeded.length) {
				break;
			}
		}

	}

}
