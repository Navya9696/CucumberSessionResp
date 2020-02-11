package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Factor_demo2 {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\A07208Trng_B4B.04.25\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Factor_demo1 PF=PageFactory.initElements(driver, Factor_demo1.class);
		PF.login("aravind.guggilla57@gmail.com","aravind");
		
	}
		
	

}
