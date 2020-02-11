package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo3_StepDef {
	
	WebDriver driver = null;
	
	@Given("User opens the allpication")
	public void user_opens_the_allpication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208Trng_B4B.04.25\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize(); //maximize browser
	}

	@When("User clicks on the log in link")
	public void user_clicks_on_the_log_in_link() {
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
	}

	@Then("User will click on login button")
	public void user_will_click_on_login_button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@Then("demo Web Shop page will open successfully")
	public void demo_Web_Shop_page_will_open_successfully() {
		System.out.println("correct output");
	}

}
