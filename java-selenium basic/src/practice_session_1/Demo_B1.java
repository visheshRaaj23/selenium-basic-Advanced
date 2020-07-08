package practice_session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_B1 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.opensourcebilling.org/");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.id("email"));
		if(un.isEnabled()) {
			System.out.println("username textfield is active");
		}
		else {
			System.out.println("username textfield is not enabled");
		}
		un.clear();
		int heightUN = un.getSize().getHeight();
		int widthUN = un.getSize().getWidth();
		System.out.println(heightUN);
		System.out.println(widthUN);
		System.out.println(un.getLocation().getX());
		System.out.println(un.getLocation().getY());
		un.sendKeys("demo@opensourcebilling.org");
		WebElement pw = driver.findElement(By.id("password"));
		int heightPW =pw.getSize().getHeight();
		int widthPW = pw.getSize().getWidth();
		System.out.println(pw.getLocation().getX());
		System.out.println(pw.getLocation().getY());
		System.out.println(heightPW);
		System.out.println(widthPW);
		Thread.sleep(2000);
		pw.clear();
		
		pw.sendKeys("demo@opensourcebilling.org");
		Thread.sleep(2000);
		//driver.findElement(By.name("btn_login")).click();
		Thread.sleep(2000);
		un.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		pw.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);

	}

}
