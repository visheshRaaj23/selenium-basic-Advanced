package section_14;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_A2 {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static WebDriver driver=null;

	@BeforeTest
	public void launchBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void getAllCookiesFromFaceBook() {
		Set<Cookie> allCookies=driver.manage().getCookies();
		System.out.println("Number of cookies present in facebook URL"+allCookies.size());
		for(Cookie cookie:allCookies) {
			System.out.println("Domain of the cookie"+cookie.getDomain());
			System.out.println("Cookie name "+cookie.getName());
			System.out.println("Cookie path"+cookie.getPath());
			System.out.println("Value of the cookie"+cookie.getValue());
		}
		
	
	}
	@Test(priority=2)
	public void getAllCookieAfterDeleting() {
		Set<Cookie> allCookiesAfterDeleting=driver.manage().getCookies();
		driver.manage().deleteAllCookies();
		System.out.println(allCookiesAfterDeleting.size());
		
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
