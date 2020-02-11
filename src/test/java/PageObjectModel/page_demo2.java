package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_demo2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\A07208Trng_B4B.04.25\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		page_demo Pobject=new page_demo(driver);
		Pobject.click_lgn();
		Pobject.type_username();
		Pobject.type_pwd();
		Pobject.click_sgn();
		
		
		
	}
	 //maximize browser

}
