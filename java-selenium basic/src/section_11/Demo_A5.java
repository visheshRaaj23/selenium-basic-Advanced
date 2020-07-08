package section_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A5 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//Count the Number of frames in nested frames and Print Middle from It
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath(".//a[text()='Nested Frames']")).click();
		Thread.sleep(2000);
		int count = driver.findElements(By.xpath(".//frame")).size();
		System.out.println(count);
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		String text = driver.findElement(By.xpath(".//div[@id='content']")).getText();
		System.out.println(text);

	}

}
