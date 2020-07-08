package section_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Use actions class and go to Amazon.com
//hover the mouse on Accounts and List using Actions Class

public class Demo_A1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.cssSelector("#captchacharacters")).click();
		Thread.sleep(10000);
		Actions action=new Actions(driver);
		WebElement move=driver.findElement(By.xpath(".//span[@class='nav-line-2 ']"));
		action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("ktm duke200").build().perform();
		action.moveToElement(move).contextClick().build().perform();

	}

}
