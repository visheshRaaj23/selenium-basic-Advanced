package practice_session_1;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the test URL");
		Scanner sc=new Scanner(System.in);
		String amazon_Url = sc.nextLine();
		sc.close();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(amazon_Url);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone");
Thread.sleep(1000);
List<WebElement> we = driver.findElements(By.xpath(".//div[@id='nav-flyout-iss-anchor']"));
int count = we.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	WebElement elements = we.get(i);
	String text = elements.getText();
	System.out.println(text);
}
we.get(count-1).click();
	}

}
