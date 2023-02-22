package Project_Mav;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;

public class orgAssertion {
	WebDriver wb;
	
  public void beforeTest() throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
	    wb=new ChromeDriver();
	    wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(3000);
	    String Actual_title=wb.getTitle();
	    System.out.println(Actual_title);
	    String Expected_title="Orangehrm";
	    AssertJUnit.assertEquals(Actual_title, Expected_title);
	   
  }
}
