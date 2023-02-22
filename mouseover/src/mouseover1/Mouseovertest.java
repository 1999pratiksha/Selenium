package mouseover1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Mouseovertest {
  WebDriver dr;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  dr=new ChromeDriverManager() ;
	   dr.navigate().to("\"https://rahulshettyacademy.com/practice-project\" ");
	   WebElem
  }
  @Test
  public void f() {
	  
  }
  @AfterTest
  public void afterTest() {
	  
  }

}
