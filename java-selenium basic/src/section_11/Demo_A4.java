package section_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_A4 {
//Handling Frames 
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://jqueryui.com/droppable/");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions action=new Actions(driver);
		 driver.findElement(By.xpath(".//div[@id='draggable']/p")).click();
		WebElement source = driver.findElement(By.xpath(".//div[@id='draggable']/p"));
		WebElement target=driver.findElement(By.xpath(".//div[@id='droppable']"));
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//img[@alt='Support the JS Foundation']")).click();
		

	}

}
