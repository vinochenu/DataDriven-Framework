package handson_DDF;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DataProvider_ApachePOI {
	
	WebDriver Object;
	
	Object[][] Data;
	
	@DataProvider(name="TestData")
	public Object[][] Dataprovider() throws IOException {
		
		Data=readExcel();
		return Data;
		
	}
	
	
	public Object[][] readExcel() throws IOException {
		
	File file=new File("C:\\vinoth\\Selenium\\Test Data_Excel\\Data_credential.xlsx");
	
	FileInputStream Fis=new FileInputStream(file);
	
	XSSFWorkbook workbook=new XSSFWorkbook(Fis);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	int rowcount=sheet.getLastRowNum();
	
	System.out.println("row count is "+rowcount);
	

	
	Object[][] credential=new Object [rowcount+1][2];
	
	
	for(int i=0;i<=rowcount;i++) {
		credential[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
		credential[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(credential[i][0]);
		System.out.println(credential[i][1]);
	
	}
	return credential;
	
	}
	
	
  @Test(dataProvider="TestData")
  public void LoginPage(String username, String password ) {
	  
	  Object.findElement(By.name("userName")).sendKeys(username);
		
		Object.findElement(By.name("password")).sendKeys(password);
		
		Object.findElement(By.name("login")).click();
		
		String ActualTitle=Object.getTitle();
		System.out.println(ActualTitle);
		
		
		
		Assert.assertTrue(ActualTitle.contains("welcome"));
		{
			System.out.println("Test Passed");
		}
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\vinoth\\Software\\Browser Drivers\\new\\chromedriver.exe");
		//Open Chrome Browser
	 Object=new ChromeDriver();
		//Get URL
		Object.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	  Object.quit();
  }

}
