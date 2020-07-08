package section_8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A4 {

	//Count the autosuggestion and select the first source and destination from autosuggestion on MakeMyTrip app
	
	static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.makemytrip.com");
		Thread.sleep(1000);
		Demo_A4.fromPlace(driver);
		Thread.sleep(1000);
		Demo_A4.toPlace(driver);
//		Thread.sleep(1000);
		///Demo_A4.select_CurrentDate(driver);
	}
	public static void fromPlace(WebDriver driver) throws InterruptedException {
		driver.findElement(By.cssSelector("input[id='fromCity']")).click();
		WebElement source=driver.findElement(By.xpath(".//input[@placeholder='From']"));
		source.sendKeys("Mumbai");
		Thread.sleep(1000);
		List<WebElement> autoSource = driver.findElements(By.xpath(".//div[@class='calc60'] //p[contains(@class,'font14')]"));
		int count=autoSource.size();
		for(int i=0;i<count;i++) {
			WebElement element=autoSource.get(i);
			String text = element.getText();
			System.out.println(text);
	}
		autoSource.get(0).click();
		
	}
	public static void toPlace(WebDriver driver) throws InterruptedException {
		//driver.findElement(By.xpath(".//input[@id='toCity']")).click();
		WebElement destination=driver.findElement(By.xpath(".//input[@placeholder='To']"));
		destination.sendKeys("Bangkok");
		Thread.sleep(1000);
		List<WebElement> autoDestination = driver.findElements(By.xpath(".//div[@class='calc60'] //p[contains(@class,'font14')]"));
		int count=autoDestination.size();
		for(int i=0;i<count;i++) {
			WebElement element=autoDestination.get(i);
			String text = element.getText();
			System.out.println(text);
	}
		autoDestination.get(0).click();
		
		
	}
	
	

}
