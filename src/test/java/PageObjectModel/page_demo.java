package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_demo {
	
	
	WebDriver driver=null;
	By lgn=By.linkText("Log in");
	By username=By.name("Email");
	By pwd=By.id("Password");
	By sgn=By.xpath("//input[@value='Log in']");
	
	public page_demo (WebDriver driver) {
		this.driver=driver;
	}
	public void click_lgn() {
		driver.findElement(lgn).click();
	}
	public void type_username() {
		driver.findElement(username).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void type_pwd() {
		driver.findElement(pwd).sendKeys("aravind");
	}
	public void click_sgn() {
		driver.findElement(sgn).click();
	}

}
