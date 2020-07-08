package stepsImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDLoginTest {
	
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
	@When("^User enters correct username and password$")
	public void user_Enters_Correctusername_and_password() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath(".//div[text()='Login ']")).click();
	}
	@Then("^The user gets the Confirmation message$")
	public void user_gets_The_Coonfirmation() {
		timeTrack=driver.getTitle();
		System.out.println(timeTrack);
		Assert.assertNotEquals(loginPage, timeTrack);
	}
	

}
