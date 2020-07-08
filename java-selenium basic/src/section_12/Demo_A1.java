package section_12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//To Count the number of links present on Webpage
//in Google.com
//in qaclickacademy.com

public class Demo_A1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://qaclickacademy.com/practice.php");
		Demo_A1.countLinksInFooter(driver);
		Demo_A1.CountLinksInGoogle(driver);
	}

	public static void countLinksInFooter(WebDriver driver) throws InterruptedException {
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int footerLinksCount = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(footerLinksCount);
		WebElement firstFooterDriver = footerDriver.findElement(By.xpath(".//table/tbody/tr/td[1]/ul"));
		int countLinks = firstFooterDriver.findElements(By.tagName("a")).size();
		System.out.println(countLinks);
		for (int i = 1; i < countLinks; i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstFooterDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
		}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.quit();
	}

	public static void CountLinksInGoogle(WebDriver driver) {
		WebDriver driver1 = new ChromeDriver();
		driver1.navigate().to("https://www.google.com");
		int count = driver1.findElements(By.tagName("a")).size();
		System.out.println(count);
	}

}
