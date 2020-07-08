package practice_session_1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_B3 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
         driver.findElement(By.name("q")).sendKeys("java");
         String xp="//span[contains(text(),'java')]";
          List<WebElement> allElem = driver.findElements(By.xpath(xp));
     int count = allElem.size();
     System.out.println(count);
     for(int i=0;i<count;i++) {
    	WebElement elem = allElem.get(i);
    	String text=elem.getText();
    	System.out.println(text);
    	
     }
     allElem.get(2).click();
         

	}

}
