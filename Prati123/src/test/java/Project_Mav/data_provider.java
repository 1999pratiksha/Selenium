package Project_Mav;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class data_provider {
	WebDriver wd;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {//we are sending string values so make it as string
	 Thread.sleep(3000);
	  wd.findElement(By.name("username")).sendKeys(n);//null should be removed by n and s
	  wd.findElement(By.name("password")).sendKeys(s);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();//logout dropdown
	  Thread.sleep(3000);
	  wd.findElement(By.linkText("Logout")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },//sending multiple values from here
      new Object[] { "Admin", "admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();//setting up the chrome driver
	  wd=new ChromeDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//orange hrm url
  }

  @AfterTest
  public void afterTest() {
  }

}
