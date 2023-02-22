package Project_Mav;

import java.io.File;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreport {
	ExtentReports extent;//declare the extentreport variable as extent
	ExtentTest logger;//logger will do all the actions and check for Pass of fail
	WebDriver wd;
  
@BeforeTest
	public void beforeTest(){
		extent =new ExtentReports(System.getProperty("user.dir")+"/test-output/prati.html",true);//i try to save the html file in the test output with the name of prati
		extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent-config.xml"));//i try to load the configuration into html file by saving it in the src/test/java
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
	}
@Test
public void orangehrm() throws InterruptedException {
	  logger=extent.startTest("demo");//this indicates that logger will have the influence on the test
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  logger.log(LogStatus.PASS, "web page has opened");//in the reports we will have a records of the steps performed
	  Thread.sleep(3000);
	  String title=wd.getTitle();
	  logger.log(LogStatus.PASS,title);//get title used to getting the title of orangehrm
	  
	  Assert.assertEquals("madhu", "madhu");
	  logger.log(LogStatus.PASS,"Assertion is passed");
	  Thread.sleep(3000);
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  logger.log(LogStatus.PASS,"username is entered");
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  logger.log(LogStatus.PASS,"Password is entered");
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  logger.log(LogStatus.PASS,"login sucessfully");
	  Thread.sleep(3000);
	  
}
@Test(dependsOnMethods = "orangehrm")
public void Logout() throws InterruptedException {
	 Thread.sleep(3000);
	wd.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();//logout dropdown
	 logger.log(LogStatus.PASS,"clicking on the dropdown");
	 Thread.sleep(3000);
	  wd.findElement(By.linkText("Logout")).click();
	  logger.log(LogStatus.PASS,"Logged out");
}
@AfterTest
public void afterTest() {
	wd.close();
	extent.endTest(logger);//this will end the logger function
	extent.flush();//this will flush all the logged data into the html report
	extent.close();//this will give an end report
}
}
