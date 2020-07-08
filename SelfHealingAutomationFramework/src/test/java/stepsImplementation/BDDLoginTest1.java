package stepsImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class BDDLoginTest1 {
	public static WebDriver driver=null;
	String loginPage;
	String timeTrack;
	@Given("^User is on the login page$")
	public void user_is_On_The_Loginpage() {
		System.out.println("User should be able to open Login Page");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		loginPage = driver.getTitle();
		System.out.println(loginPage);
	}
}
