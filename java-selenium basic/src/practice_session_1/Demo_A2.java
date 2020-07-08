package practice_session_1;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_A2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Test Url");
		String _flipKartUrl=sc.nextLine();
		sc.close();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(_flipKartUrl);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//button)[2]")));
		driver.findElement(By.xpath("(.//button)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("iPhone ");
		Thread.sleep(3000);
		List<WebElement> allIphones = driver.findElements(By.xpath(".//li[@class='_1va75j']"));
		int count = allIphones.size();
		System.out.println(count);
		for(int i=0;i<=count;i++) {
			WebElement ele=allIphones.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		
		allIphones.get(count-1).click();
		
		

	}

}
