package practice_session_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.makemytrip.com/flights/");
		makeMyTrip.source("Bangalore", driver);
		Thread.sleep(1000);
		makeMyTrip.destination("Bangkok", driver);

	}
	
	public static void source(String str,WebDriver driver) throws InterruptedException {
		WebElement sourceCity=driver.findElement(By.id("fromCity"));     
		sourceCity.sendKeys(str); 
		List<WebElement> autoOrigin = driver.findElements(By.xpath(".//p[contains(@class,'font14')]"));
		int count = autoOrigin.size();
		System.out.println(count);
		try {
		for(int i=0;i<count;i++) {
			WebElement origin = autoOrigin.get(i);
			String text = origin.getText();
			System.out.println(text);
		}
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		finally {
		autoOrigin.get(0).click();
		}
		

}
	public static void destination(String dest,WebDriver driver) {
		WebElement destCity=driver.findElement(By.cssSelector("input[id='toCity']"));
		destCity.sendKeys(dest);
		List<WebElement> autoDestination = driver.findElements(By.xpath(".//p[contains(@class,'font14')]"));
		int count = autoDestination.size();
		System.out.println(count);
		try {
		for(int i=0;i<count;i++) {
			WebElement destination = autoDestination.get(i);
			String text = destination.getText();
			System.out.println(text);
		}
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		finally {
		autoDestination.get(0).click();
		}
		
	}
}
