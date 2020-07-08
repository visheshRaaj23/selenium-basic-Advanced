package practice_session_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_B2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vishesh%20and%20Varsha/Desktop/html/sample1.html");
		Thread.sleep(1000);
		List<WebElement> allLists = driver.findElements(By.tagName("a"));
		int count=allLists.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement link = allLists.get(i);
			String text = link.getText();
			System.out.println(text);
		}

	}

}
