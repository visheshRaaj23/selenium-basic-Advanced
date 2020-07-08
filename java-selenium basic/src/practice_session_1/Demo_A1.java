package practice_session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A1 {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Vishesh%20and%20Varsha/Desktop/html/demo.html");
		WebElement we = driver.findElement(By.id("a1"));
		we.click();
		driver.navigate().back();
		WebElement we1 = driver.findElement(By.name("n1"));
		we1.click();
		driver.navigate().back();
		WebElement we2 = driver.findElement(By.tagName("a"));
		we2.click();
		
		driver.close();

	}

}
