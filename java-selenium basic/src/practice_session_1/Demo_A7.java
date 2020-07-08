package practice_session_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_A7 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	    driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.navigate().to("https://www.spicejet.com/");
	   Demo_A7.setOrigin("BLR");
	   Thread.sleep(2000);
	   Demo_A7.setDestination("IXE");
	   Thread.sleep(2000);
	   driver.findElement(By.id("divpaxinfo")).click();
	   Thread.sleep(1000);
	   Select select=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
	   select.selectByIndex(5);
	   WebDriverWait wait =new WebDriverWait(driver,7);
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("ctl00$mainContent$ddl_Child"))));
	   Select selectChild=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child")));
	   selectChild.selectByVisibleText("2");
	   Thread.sleep(3000);
	   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	   Select selectCurrencyMethod =new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
	   selectCurrencyMethod.selectByVisibleText("USD");
	   Thread.sleep(2000);
	   driver.close();
	}
	
	public static void setOrigin(String org) {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath(".//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='"+org+"']")).click();
	}
	public static void setDestination(String dest) {
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath(".//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='"+dest+"']")).click();
		
	}
}
