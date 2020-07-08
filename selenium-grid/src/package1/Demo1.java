package package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users/Vishesh and Varsha/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setCapability(CapabilityType.PLATFORM,Platform.WIN10);
		co.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		 WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"), co);
	        driver.get("http://google.com/");
	        System.out.println("Title is : "+driver.getTitle());
	        driver.quit();

	}

}
