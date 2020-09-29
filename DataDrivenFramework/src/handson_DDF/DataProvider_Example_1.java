package handson_DDF;

import org.testng.annotations.Test;

import common.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProvider_Example_1 {
	
	WebDriver Object;
	
	@DataProvider(name="TestData_Credential")
	public Object[][] testData() {
		
		/*String [][] Data= {
				{"123","321"},
				{"Admin","admin123"},
				{"abc","xyz"}
				};,*/
				
				String [][] Data=new String[3][2];				
		
				Data[0][0]= "123";
				Data[0][1]= "321";
				
				Data[0][0]= "Admin";
				Data[0][1]= "admin123";
				
				Data[0][0]= "abc";
				Data[0][1]= "xyz";
		
		return Data;
		
	}
	
	
  @Test(dataProvider="TestData_Credential")
  public void loginPage(String username,String password) {
	  
	  Object.findElement(By.id("txtUsername")).sendKeys("username");
		
		Object.findElement(By.id("txtPassword")).sendKeys("password");
		
		Object.findElement(By.id("btnLogin")).click();
		
		System.out.println(Object.getTitle());
		
	
		
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
	 Object=new ChromeDriver();
		//Get URL
		Object.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
  }

  @AfterTest
  public void afterTest() {
	  
	  Object.quit();
  }

}
