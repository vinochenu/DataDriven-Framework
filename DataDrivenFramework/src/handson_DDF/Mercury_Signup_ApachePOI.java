package handson_DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Mercury_Signup_ApachePOI {
	
	WebDriver Object;
	
	String[][] data;
	
	@DataProvider(name="TestData")
	public String[][] Dataprovider() throws IOException {
		
		data=readexcel();
		return data;
		
	}
	
	public String[][] readexcel() throws IOException {
		
		File file=new File("C:\\vinoth\\Selenium\\Test Data_Excel\\Data_credential.xlsx");
		
		FileInputStream Fis=new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(Fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("row count is "+rowcount);
		
		String[][] details=new String[rowcount+1][12];
		
		for(int i=0;i<=rowcount;i++) {
			
					Cell cell1=sheet.getRow(i).getCell(0);
							cell1.setCellType(CellType.STRING);
					details[i][0]=cell1.getStringCellValue();
					
					Cell cell2=sheet.getRow(i).getCell(1);
					cell2.setCellType(CellType.STRING);
			details[i][1]=cell1.getStringCellValue();
			
			Cell cell3=sheet.getRow(i).getCell(2);
			cell3.setCellType(CellType.STRING);
	details[i][2]=cell1.getStringCellValue();
	
	Cell cell4=sheet.getRow(i).getCell(3);
	cell4.setCellType(CellType.STRING);
details[i][3]=cell1.getStringCellValue();

Cell cell5=sheet.getRow(i).getCell(4);
cell5.setCellType(CellType.STRING);
details[i][4]=cell1.getStringCellValue();

Cell cell6=sheet.getRow(i).getCell(5);
cell6.setCellType(CellType.STRING);
details[i][5]=cell1.getStringCellValue();

Cell cell7=sheet.getRow(i).getCell(6);
cell7.setCellType(CellType.STRING);
details[i][6]=cell1.getStringCellValue();

Cell cell8=sheet.getRow(i).getCell(7);
cell4.setCellType(CellType.STRING);
details[i][7]=cell1.getStringCellValue();

Cell cell9=sheet.getRow(i).getCell(8);
cell9.setCellType(CellType.STRING);
details[i][8]=cell1.getStringCellValue();

Cell cell10=sheet.getRow(i).getCell(9);
cell10.setCellType(CellType.STRING);
details[i][9]=cell1.getStringCellValue();

Cell cell11=sheet.getRow(i).getCell(10);
cell11.setCellType(CellType.STRING);
details[i][10]=cell1.getStringCellValue();


Cell cell12=sheet.getRow(i).getCell(11);
cell12.setCellType(CellType.STRING);
details[i][11]=cell1.getStringCellValue();

Cell cell13=sheet.getRow(i).getCell(12);
cell13.setCellType(CellType.STRING);
details[i][12]=cell1.getStringCellValue();

			
			
			/*details[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			 details[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
			 details[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
			details[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
			details[i][4]=sheet.getRow(i).getCell(4).getStringCellValue();
			details[i][5]=sheet.getRow(i).getCell(5).getStringCellValue();
			details[i][6]=sheet.getRow(i).getCell(6).getStringCellValue();
			details[i][7]=sheet.getRow(i).getCell(7).getStringCellValue();
			details[i][8]=sheet.getRow(i).getCell(8).getStringCellValue();
			details[i][9]=sheet.getRow(i).getCell(9).getStringCellValue();
			details[i][10]=sheet.getRow(i).getCell(10).getStringCellValue();
			details[i][11]=sheet.getRow(i).getCell(11).getStringCellValue();
			details[i][12]=sheet.getRow(i).getCell(12).getStringCellValue();*/
			
			
			/*details[i][0]=sheet.getRow(i).getCell(0).getStringCellValue().toString();
			details[i][1]=sheet.getRow(i).getCell(1).getStringCellValue().toString();
			details[i][2]=sheet.getRow(i).getCell(2).getStringCellValue().toString();
			details[i][3]=sheet.getRow(i).getCell(3).getStringCellValue().toString();
			details[i][4]=sheet.getRow(i).getCell(4).getStringCellValue().toString();
			details[i][5]=sheet.getRow(i).getCell(5).getStringCellValue().toString();
			details[i][6]=sheet.getRow(i).getCell(6).getStringCellValue().toString();
			details[i][7]=sheet.getRow(i).getCell(7).getStringCellValue().toString();
			details[i][8]=sheet.getRow(i).getCell(8).getStringCellValue().toString();
			details[i][9]=sheet.getRow(i).getCell(9).getStringCellValue().toString();
			details[i][10]=sheet.getRow(i).getCell(10).getStringCellValue().toString();
			details[i][11]=sheet.getRow(i).getCell(11).getStringCellValue().toString();
			details[i][12]=sheet.getRow(i).getCell(12).getStringCellValue().toString();*/
			
			/*details[i][0]=sheet.getRow(i).getCell(0).toString();
			details[i][1]=sheet.getRow(i).getCell(1).toString();
			details[i][2]=sheet.getRow(i).getCell(2).toString();
			details[i][3]=sheet.getRow(i).getCell(3).toString();
			details[i][4]=sheet.getRow(i).getCell(4).toString();
			details[i][5]=sheet.getRow(i).getCell(5).toString();
			details[i][6]=sheet.getRow(i).getCell(6).toString();
			details[i][7]=sheet.getRow(i).getCell(7).toString();
			details[i][8]=sheet.getRow(i).getCell(8).toString();
			details[i][9]=sheet.getRow(i).getCell(9).toString();
			details[i][10]=sheet.getRow(i).getCell(10).toString();
			details[i][11]=sheet.getRow(i).getCell(11).toString();
			details[i][12]=sheet.getRow(i).getCell(12).toString();*/
			
			
		}
		
		return details;
		
	}
	
	
 @Test(dataProvider="TestData")
  public void signup(String Firstname,String Lastname,String Phone,String Username,String Address1,String Address2,String City,String State,String Postcode,String Email,String Password,String ConfirmPassword) {
	 Object.findElement(By.linkText("REGISTER")).click();
		Object.findElement(By.name("firstName")).clear();
		Object.findElement(By.name("firstName")).click();
		Object.findElement(By.name("firstName")).sendKeys("Firstname");
		
		Object.findElement(By.name("lastName")).clear();
		Object.findElement(By.name("lastName")).click();
		Object.findElement(By.name("lastName")).sendKeys("Lastname");
		
		Object.findElement(By.name("phone")).clear();
		Object.findElement(By.name("phone")).click();
		Object.findElement(By.name("phone")).sendKeys("Phone");
		
		Object.findElement(By.name("userName")).clear();
		Object.findElement(By.name("userName")).click();
		Object.findElement(By.name("userName")).sendKeys("Username");
		
		Object.findElement(By.name("address1")).sendKeys("Address1");
		
		Object.findElement(By.name("address2")).sendKeys("Address2");
		
		Object.findElement(By.name("city")).sendKeys("City");
		
		Object.findElement(By.name("state")).sendKeys("State");
		
		Object.findElement(By.name("postalCode")).sendKeys("Postcode");
		
		Object.findElement(By.name("country")).click();
		new Select(Object.findElement(By.name("country"))).selectByVisibleText("INDIA");
				
		Object.findElement(By.name("email")).clear();
		Object.findElement(By.name("email")).click();
		Object.findElement(By.name("email")).sendKeys("Email");
		
		Object.findElement(By.name("password")).clear();
		Object.findElement(By.name("password")).click();
		Object.findElement(By.name("password")).sendKeys("Password");
		
		Object.findElement(By.name("confirmPassword")).clear();
		Object.findElement(By.name("confirmPassword")).click();
		Object.findElement(By.name("confirmPassword")).sendKeys("ConfirmPassword");
		
		Object.findElement(By.xpath("//input[@type='image' and @name='register']")).click();
		
		Object.close();
	 
	 
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
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
