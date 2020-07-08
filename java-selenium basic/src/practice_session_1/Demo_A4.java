package practice_session_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
 void customWait(WebDriver driver) {
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		try {
			driver.navigate().to("https://demo.actitime.com/login.do");
			System.out.println("Page is loaded with in 3 Seconds");
		}
		catch (Exception e) {
			System.out.println("Couldn't load the page with in 3 seconds"+e);
		}
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Demo_A4 obj=new Demo_A4();
		obj.customWait(driver);

	}

}
