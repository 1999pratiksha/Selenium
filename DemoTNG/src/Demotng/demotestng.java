package Demotng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class demotestng {
  WebDriver wb;
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  wb=new ChromeDriver();
	  wb.navigate().to("https://opensource-demo.orangehrmlive.com");
	  Thread.sleep(3000);
	  
	  
  }
  
  @Test(priority= 0)
  public void login() throws InterruptedException {
	  wb.findElement(By.xpath("//*[@name=\'username\']")).sendKeys("Admin");
		 //wd.findElement(By.name("username")).sendKeys("Admin"); Two methods can be used.
		 wb.findElement(By.name("password")).sendKeys("admin123");
		 wb.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		 //wd.findElement(By.xpath("//*[@class=\'oxd-main-menu-item active\']")).click();
		 Thread.sleep(3000);
  }
  @Test(enabled=false)
  public void Admin() throws InterruptedException {
	 
	  wb.findElement(By.linkText("Admin")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.linkText("Dashboard")).click();
	    Thread.sleep(3000);
  }
   @Test (priority=1)
  public void logout() throws InterruptedException {
  wb.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
  Thread.sleep(1000);
  wb.findElement(By.linkText("Logout")).click();
  Thread.sleep(3000);
  }
  
  
  @AfterTest
  public void afterTest() {
	  wb.close();
  }
  }


