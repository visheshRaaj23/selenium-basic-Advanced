package session_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://qaclickacademy.com/practice.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement tableElement = driver.findElement(By.xpath(".//table[@id='product']"));
		int rowSize = tableElement.findElements(By.xpath(".//tr")).size();
		System.out.println("Number of Rows are " + rowSize);
		int colSize = tableElement.findElements(By.xpath(".//th")).size();
		System.out.println("Column Size is " + colSize);
		for (int i = 0; i < colSize; i++) {
			String columnAttributes = tableElement.findElements(By.xpath(".//th")).get(i).getText();
			System.out.println(columnAttributes);
			for (int j = 0; j < rowSize; j++) {
				System.out.println("For column " + i + "Attributes");
				String text = tableElement.findElements(By.xpath(".//td")).get(i).getText();
				System.out.println(text);
			}
		}
	}

}
