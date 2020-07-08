package section_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo_A1 {

	public static void main(String[] args) {
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.acceptInsecureCerts();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		ChromeOptions co =new ChromeOptions();
		co.merge(dc);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionTimedout");

	}

}
