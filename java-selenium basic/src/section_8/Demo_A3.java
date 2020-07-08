package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo_A3 {

	static WebDriver driver;
	public static void main(String[] args) {
	

	}
	public static void getSource( WebDriver driver) {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		WebElement source=driver.findElement(By.xpath(".//a[@value='BLR']"));
		source.click();
	}
	public static void getDestination(WebDriver driver) {
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		WebElement destination=driver.findElement(By.xpath("(.//a[@value='GOI'])[2]"));
		destination.click();
		//Identify the parent by moving the curser and find its parent
		//driver.findElement(By.xpath(".//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']"));
	}

}
