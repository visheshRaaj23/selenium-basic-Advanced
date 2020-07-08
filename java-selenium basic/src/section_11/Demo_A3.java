package section_11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_A3 {
	//Navigate to the URL:https://the-internet-herokuapp.com
	//Go the Multiple windows and click it.
	//print the title of landed page and click on next page
	//Once it switches to next page capture the Text present on the webpage
	//back to parent page and capture the text
	//print it on the console.
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("(.//li/a)[33]")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[text()='Click Here']")));
		driver.findElement(By.xpath(".//a[text()='Click Here']")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String>itr=ids.iterator();
		String parentWindow=itr.next();
		String childWindow=itr.next();
		driver.switchTo().window(childWindow);
		String text = driver.findElement(By.xpath(".//h3")).getText();
		System.out.println(text);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		String parentText = driver.findElement(By.xpath(".//h3")).getText();
		System.out.println(parentText);

	}

}
