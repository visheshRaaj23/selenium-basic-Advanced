package session_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_A6 {

	static WebDriver driver = null;
	Demo_A5 meth = new Demo_A5();

	@BeforeSuite
	public void m1() {
		System.out.println("Hi Volvo");
	}

	@BeforeClass
	public void m2() {
		System.out.println("Hi Scania");
	}

	@BeforeMethod
	public void m3() {
		System.out.println("Hi Audi");
	}

	@BeforeTest
	public void invokeBrowser() {
		driver = meth.chooseBrowserDriver("chrome");

		driver.get("https://www.google.com");

	}

	@Test
	public void hitUrl() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Volvo Buses India", Keys.ENTER);

	}

	@Test
	public void clickFirstLink() {
		driver.findElement(By.xpath("(.//a[@href='https://www.volvobuses.in/'])[1]")).click();
	}

	@AfterTest
	public void closeBrowser() {
		meth.closeBrowser();
	}

	@AfterMethod
	public void m4() {
		System.out.println("Hi Mercedes Benz");
	}

	@AfterClass
	public void m5() {
		System.out.println("Hi Hyundai");
	}

	@AfterSuite
	public void m6() {
		System.out.println("Hi Lexus");
	}

}
