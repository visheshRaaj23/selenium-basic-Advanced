package section_12;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A4 {
	
	//Implementing Calendar UI in Spicejet.com Automation
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().to("https://www.spicejet.com/");
	driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath(".//li/a[@value='MAA']")).click();
	driver.findElement(By.xpath("(.//li/a[@value='BLR'])[2]")).click();
	
	while(!driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month'] ")).getText().contains("June")) {
		driver.findElement(By.xpath(".//span[text()='Next']")).click();
	}
	
	List<WebElement> departDates = driver.findElements(By.cssSelector("[class='ui-state-default']"));
	int count=departDates.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String date=driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).getText();
		if(date.contains("23")) {
			driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).click();
			break;
		}
	}
	
	
	}

}
