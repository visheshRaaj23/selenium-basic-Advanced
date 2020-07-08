package section_8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Static drop downs using  select class for www.spicejet.com

public class Demo_A1  {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		Select select=new Select(driver.findElement(By.xpath(".//p/select[@name='ctl00$mainContent$ddl_Adult']")));
		select.selectByIndex(4);
		select.selectByValue("7");
		select.selectByVisibleText("2");
		Thread.sleep(2000);
		Select selectChild=new Select(driver.findElement(By.xpath(".//p/select[@name='ctl00$mainContent$ddl_Child']")));
		selectChild.selectByIndex(3);
		selectChild.selectByVisibleText("1");
		Thread.sleep(2300);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		driver.close();
	}

}


//for(int i=0;i<n;i++){
// for multiple clicks on the + button

// driver.findElement(By.id("btnCloseException").click();
//}
