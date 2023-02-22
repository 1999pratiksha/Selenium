package Project_Mav;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
 WebDriver wd;
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();//setting up the chrome driver
	  wd=new ChromeDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @Test
  public void login() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Thread.sleep(3000);
	  wd.findElement(By.name("username")).sendKeys("Admin");//null should be removed by n and s
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.linkText("Admin")).click();
	  Thread.sleep(3000);
	  WebElement dropdown= wd.findElement(By.xpath("//*[@class='oxd-select-text-input'][1]"));
	  dropdown.click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	  js.executeScript("window.scrollBy(0,1000)");
	  
  }
  
  @AfterTest
  public void afterTest() {
	  
  }

}
