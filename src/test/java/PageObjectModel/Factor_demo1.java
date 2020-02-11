package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Factor_demo1 {
	WebDriver driver=null;
	@FindBy(how=How.LINK_TEXT , using = "Log in") WebElement login;
	@FindBy(how=How.NAME , using = "Email") WebElement username;
	@FindBy(how=How.ID ,using = "Password") WebElement password;
	@FindBy(how=How.XPATH , using = "//input[@value='Log in']") WebElement sgn;
	
	public Factor_demo1(WebDriver driver) {
		this.driver=driver;
	}
	public void login(String uid, String pwd) {
		login.click();
		username.sendKeys(uid);
		password.sendKeys(pwd);
		sgn.click();
	}
	

}
