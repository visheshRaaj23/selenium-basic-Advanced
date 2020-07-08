package practice_session_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_A6 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Demo_A6 d1=new Demo_A6();
		d1.performFunction(driver);

	}
	
	public void performFunction(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.rediff.com/");
		driver.findElement(By.xpath(".//a[text()='Sign in']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#login1")));
		driver.findElement(By.cssSelector("input#login1")).sendKeys("vishesh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("kadambari");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		//Check whether error message is displayed or not
		Thread.sleep(2000);
		if(driver.findElement(By.xpath(".//div[contains(text(),'Wrong username')]")).isDisplayed()) {
			System.out.println("Test is failed");
			System.out.println("Wrong Username and password!! Please enter correct details");
			System.out.println(driver.findElement(By.xpath(".//div[contains(text(),'Wrong username')]")).getText());
		}
		driver.quit();
	}

}
