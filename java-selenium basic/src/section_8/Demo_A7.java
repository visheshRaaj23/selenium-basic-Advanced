package section_8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Vishesh Raaj");
	driver.findElement(By.cssSelector("#alertbtn")).click();
	Thread.sleep(2000);
	String alert_1_Text=driver.switchTo().alert().getText();
	System.out.println(alert_1_Text);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	//Type 2 alert with OK and Cancel Button.
	driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Vishesh Raaj");
	driver.findElement(By.cssSelector("#confirmbtn")).click();
	String alert_2_text =driver.switchTo().alert().getText();
	System.out.println(alert_2_text);
	//To Click Cancel Button in the Java script popup
	driver.switchTo().alert().dismiss();
	Thread.sleep(1000);
	driver.close();
	
	}

}
