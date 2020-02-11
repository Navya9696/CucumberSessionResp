package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_Demo2 {
	WebDriver driver = null;
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208Trng_B4B.04.25\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize(); //maximize browser
		  
	}

	@When("^user clicks on Register Button$")
	public void user_clicks_on_Register_Button() throws Throwable {
		driver.findElement(By.xpath("//a[@href='/register']")).click();
	}

	@When("^user will select Female in gender field$")
	public void user_will_select_Female_in_gender_field() throws Throwable {
		driver.findElement(By.id("gender-female")).click(); // 
	}

	@When("^user enters the Navya as the First Name$")
	public void user_enters_the_Navya_as_the_First_Name() throws Throwable {
	   driver.findElement(By.name("FirstName")).sendKeys("Navya");
	}

	@When("^user enter Ravi as the Last Name$")
	public void user_enter_Ravi_as_the_Last_Name() throws Throwable {
		   driver.findElement(By.name("LastName")).sendKeys("Ravi");

	}

	@When("^user enters avfc@gmail\\.com as Email ID$")
	public void user_enters_avfc_gmail_com_as_Email_ID() throws Throwable {
	    driver.findElement(By.id("Email")).sendKeys("avfc@gmail.com");
	}

	@When("^user enters teraserd as Password$")
	public void user_enters_teraserd_as_Password() throws Throwable {
	   driver.findElement(By.id("Password")).sendKeys("teraserd");
	   
	}

	@When("^user enters teraserd as Confirm Password$")
	public void user_enters_teraserd_as_Confirm_Password() throws Throwable {
driver.findElement(By.id("ConfirmPassword")).sendKeys("teraserd");
	}

	@Then("^user clicks on Register$")
	public void user_clicks_on_Register() throws Throwable {
	    driver.findElement(By.id("register-button")).click();
	}

	@Then("^user will be registered successfully$")
	public void user_will_be_registered_successfully() throws Throwable {
	    System.out.println("successfully registered");
	}


}
