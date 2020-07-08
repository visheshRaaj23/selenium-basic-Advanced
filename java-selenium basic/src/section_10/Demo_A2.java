package section_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_A2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("(//a)[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='results']")));
		String text = driver.findElement(By.id("results")).getText();
		System.out.println(text);
		driver.close();
	}

}
