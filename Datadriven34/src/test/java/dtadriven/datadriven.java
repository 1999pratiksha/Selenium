package dtadriven;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class datadriven 
{
  WebDriver wd;
  public String Username1,Password1;
  public String URL="https://opensource-demo.orangehrmlive.com/";
    @BeforeTest
    public void beforeTest() throws InterruptedException 
    {
	  WebDriverManager.chromedriver().setup();
	  wd=new ChromeDriver();
	  wd.get(URL);
	  Thread.sleep(3000);
    }
    @Test
     public void datdriven() throws IOException, InterruptedException 
    {
	  File excel=new File("C://Users//naikp//Downloads//Book1.xlsx");//path of excel file
	  FileInputStream f2=new FileInputStream(excel);//importing data from inputstream
	  XSSFWorkbook book=new XSSFWorkbook(f2);
	  XSSFSheet sheet=book.getSheet("Sheet1");//Sheet1 is excel first sheet
	  int row_count=sheet.getLastRowNum();//fetchesb data till last row
	  for(int i=0;i<=row_count;i++) 
	  {
		 String Username=sheet.getRow(i).getCell(0).getStringCellValue();//first row first column for username field
		 String Password=sheet.getRow(i).getCell(1).getStringCellValue();//first row and 2nd column for password field{firstusername and first password will fetch}
		 wd.findElement(By.name("username")).sendKeys(Username);
		 wd.findElement(By.name("password")).sendKeys(Password);
		 wd.findElement(By.xpath("//*[@type='submit']")).click();
		 Thread.sleep(3000);
		 if(wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
		 {//dashboard url after login dashboard will appear so here we are copying that url if condition is valid and it will perform logout operation
			  wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
			  Thread.sleep(3000);
			  wd.findElement(By.linkText("Logout")).click();
			  Thread.sleep(3000);
			  
		 }
		  else if(wd.findElement(By.xpath("//*[@class='oxd-alert-content oxd-alert-content--error']")).isDisplayed()) {
			//if error message displayed then i value will be incremented by 1..in excel sheet it will fetch nxt value and perform the operations.
			  for(int j=i+1;j<=row_count;j++) 
			  {
					 Username1=sheet.getRow(j).getCell(0).getStringCellValue();
					 Password1=sheet.getRow(j).getCell(1).getStringCellValue();
					 wd.findElement(By.name("username")).sendKeys(Username1);
					 wd.findElement(By.name("password")).sendKeys(Password1);
	                 wd.findElement(By.xpath("//*[@type='submit']")).click();
					 Thread.sleep(3000);
					 if(wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) 
					 {
						wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
						Thread.sleep(3000);
						wd.findElement(By.linkText("Logout")).click();
						Thread.sleep(3000);
		              }
		      }
	  break;
	  
 }
 }
	 book.close();  
  }

  @AfterTest
  public void afterTest() {
	  wd.quit();
  }

}
