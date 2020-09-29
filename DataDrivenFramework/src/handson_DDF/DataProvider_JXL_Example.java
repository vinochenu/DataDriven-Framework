package handson_DDF;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DataProvider_JXL_Example {
	
	WebDriver Object;
	
	String [][]data;
	
	
	@DataProvider(name="TestData_JXL")
	public String[][] dataProvider_JXL() throws BiffException, IOException {
		
		data=excelData();
		
		return data;
	}
	
	public String[][] excelData() throws BiffException, IOException {
		
		
		
		FileInputStream file=new FileInputStream("C:\\vinoth\\Selenium\\Selenium_Basics\\Dynamic_Table.xls");
		
		Workbook workbook=Workbook.getWorkbook(file);
		
		Sheet sheet=workbook.getSheet(1);
		
		int rowcount=sheet.getRows();
		
		int columncount=sheet.getColumns();
		
		String [][] credential=new String[rowcount][columncount];
		
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				credential  [i][j]=sheet.getCell(j, i).getContents();
				
			}
		}
		
		return credential;
		
	}
	
	
	
	@Test(dataProvider="TestData_JXL")
	  public void loginPage(String username,String password) {
		  
		  Object.findElement(By.id("txtUsername")).sendKeys("username");
			
			Object.findElement(By.id("txtPassword")).sendKeys("password");
			
			Object.findElement(By.id("btnLogin")).click();
			
			System.out.println(Object.getTitle());		
	  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
	 Object=new ChromeDriver();
		//Get URL
		Object.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterClass
  public void afterClass() {
	  
	  Object.quit();
  }

}
