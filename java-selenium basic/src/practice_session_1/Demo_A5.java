package practice_session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A5 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("vishesh");
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("volvo9400xl");
		driver.findElement(By.xpath(".//input[@value='Log In']")).click();
		//Check whether error message is displayed or not
		Thread.sleep(1000);
		if(driver.findElement(By.id("error")).isDisplayed()) {
			
			System.out.println("Script Failed");
			System.out.println(driver.findElement(By.id("error")).getText());
			
		}
		else {
			System.out.println("Script passed with logging in");
		}

	}

}
