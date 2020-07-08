package session_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class Demo_A5 {
	
	static WebDriver driver=null;
	
	//Choose driver
	
	public WebDriver chooseBrowserDriver(String browserType) {
		switch(browserType) {
		case "chrome":{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		}
		case "firefox":{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		}
//		case "internetExplorer":{
//			driver=new InternetExplorerDriver();
//		}
		default:{
			driver=new ChromeDriver();
		}
		
		}
		return driver;
	}
	public void closeBrowser() {
		driver.close();
	}

}
