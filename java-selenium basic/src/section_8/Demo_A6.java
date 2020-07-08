package section_8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A6 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://qaclickacademy.com/practice.php");
		int count=driver.findElements(By.xpath(".//input[@type='checkbox']")).size();
		System.out.println(count);
		driver.findElement(By.xpath(".//input[@id='checkBoxOption2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@id='checkBoxOption2']")).click();
		if(driver.findElement(By.xpath(".//input[@id='checkBoxOption2']")).isSelected()==false) {
			System.out.println("Test is passed");
			driver.close();
		}else {
			System.out.println("Test is failed");
		}

	}

}
