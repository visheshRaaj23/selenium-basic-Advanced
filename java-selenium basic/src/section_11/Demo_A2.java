package section_11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_A2 {

	// Go To Google.com/signup page click on Privacy
	// it opens second page immediate child page
	// Print the title of that child page by switching
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://accounts.google.com/signup");
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(.//li/a)[1]")).click();
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> itr = ids.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		System.out.println("After switching");
		driver.switchTo().window(childWindow);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("After switching back to child window");
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

	}

}
