package practice_session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver1=new ChromeDriver();
		DemoB.test(driver1);
		
		WebDriver driver2 = new FirefoxDriver();
		DemoB.test(driver2);
		

	}
	
	public static void test(WebDriver driver) {
		driver.get("http://www.volvo.com");
		String webTitle=driver.getTitle();
		System.out.println(webTitle);
		driver.close();
	}

}
