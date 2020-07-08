package section_8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TO count the number of checkboxes present on spicejet.com website aand return results as pass or fail
//TestNG is a testing framework usually called as TestNG libraries
//Assert statement is present in testNG libraries
//assertEquals(actualResults,ExpectedResults) assertTrue(True) assertFalse(False) 
//if assert.assertTrue(False) -->it cuts the execution.
public class Demo_A5 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.spicejet.com");
		int count=driver.findElements(By.xpath(".//input[@type='checkbox']")).size();
		System.out.println(count);
		WebElement checkbox=driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		checkbox.click();
		//Assert.assertEquals(checkbox.isSelected(), false);
		if(checkbox.isSelected()) {
			System.out.println("Test is Pass");
		}
		else {
			System.out.println("Test is failed");
		}

	}

}
