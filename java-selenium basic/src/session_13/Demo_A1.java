package session_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Navigate to Cricbuzz.com and add all the scores present in 3rd column
//Match the summed score with the expected score
//Close the browser

public class Demo_A1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		int sum = 0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(
				"https://www.cricbuzz.com/live-cricket-scorecard/24379/cgc-vs-rpr-16th-match-bangladesh-premier-league-2019-20");
		WebElement webTable = driver
				.findElement(By.xpath(".//div/span[text()='Chattogram Challengers Innings']/../.."));
		int size = webTable.findElements(By.cssSelector(".cb-col.cb-col-8.text-right.text-bold")).size();
		System.out.println(size);
		int numberOfRows = webTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(numberOfRows);
		for (int i = 0; i < numberOfRows - 3; i++) {

			String text = webTable
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			System.out.println(text);
			int number = Integer.parseInt(text);
			sum = sum + number;

		}
		System.out.println(sum);
		String extra = webTable.findElement(By.xpath(".//div[text()='Extras']//following-sibling::div[1]")).getText();
		int extraCount = Integer.parseInt(extra);
		int totalSum = sum + extraCount;
		System.out.println(totalSum);
		String actualCount = webTable.findElement(By.xpath(".//div[text()='Total']//following-sibling::div[1]"))
				.getText();
		int actualCountInInt = Integer.parseInt(actualCount);
		System.out.println(actualCountInInt);
		if (actualCountInInt == totalSum) {
			System.out.println("Test is Pass");

		} else {
			System.out.println("Test is Failed");
		}

	}

}
