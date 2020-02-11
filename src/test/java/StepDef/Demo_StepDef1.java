package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Demo_StepDef1 {
	
	WebDriver driver =null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208Trng_B4B.04.25\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize(); //maximize browser
		  driver.findElement(By.linkText("Log in")).click();
	}

	@When("user enters aravind.guggilla57@gmail.com as Email ID")
	public void user_enters_aravind_guggilla57_gmail_com_as_Email_ID() {
		 driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
	}

	@When("user enter aravind as Password")
	public void user_enter_aravind_as_Password() {
		 driver.findElement(By.name("Password")).sendKeys("aravind");
	}

	@Then("user will click on login button")
	public void user_will_click_on_login_button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@Then("Demo Web Shop page will open successfully")
	public void demo_Web_Shop_page_will_open_successfully() {
	    System.out.println("correct output");
	}


}
