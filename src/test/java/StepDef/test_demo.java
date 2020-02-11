package StepDef;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_demo {
  @Test
  public void f() throws IOException{
	  File src=new File("C:\\Users\\A07208Trng_B4B.04.25\\Desktop\\sample data.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh= wb.getSheetAt(0);
	  System.out.println("First row no"+sh.getFirstRowNum());
	  System.out.println("Second row no"+sh.getLastRowNum());
	  int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();
	  int noofcoloumns=sh.getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Row count is"+rowCount);
	  System.out.println("Col count is"+noofcoloumns);
	 // System.out.println(sh.getRow(0).getCell(0).getStringCellValue()+"\t\t\\t"+sh.getRow(0).getCell(0).getStringCellValue());
	  //System.out.println(sh.getRow(0).getCell(1).getStringCellValue()+"\t\t\\t"+sh.getRow(0).getCell(1).getStringCellValue());
	  //System.out.println(sh.getRow(1).getCell(0).getStringCellValue()+"\t\t\\t"+sh.getRow(1).getCell(0).getStringCellValue());
	  //System.out.println(sh.getRow(1).getCell(1).getStringCellValue()+"\t\t\\t"+sh.getRow(1).getCell(1).getStringCellValue());
	  for (int i=1;i<rowCount;i++) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208Trng_B4B.04.25\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			driver.findElement(By.name("Password")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			driver.quit();
	  }
	  
		  
  }
}
