package section_12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_A2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://qaclickacademy.com/practice.php");
		WebElement link3 = driver.findElement(By.xpath("(.//input[@type='checkbox'])[3]"));
		link3.click();
		String text=driver.findElement(By.xpath("(.//div/fieldset/label)[6]")).getText();
		System.out.println(text);
		Select select=new Select(driver.findElement(By.xpath(".//select[@id='dropdown-class-example']")));
		select.selectByVisibleText(text);
		driver.findElement(By.xpath(".//input[@id='name']")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String popUpText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	
		if(popUpText.contains(text)) {
			System.out.println("Test is pass");
		} else {
			System.out.println("Test is fail");
		}
		
		

	}

}
