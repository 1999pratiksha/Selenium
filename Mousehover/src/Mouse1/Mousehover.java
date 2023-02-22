package Mouse1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Mousehover {
  WebDriver dr;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  dr=new ChromeDriver();
	  dr.navigate().to("https://rahulshettyacademy.com/practice-project");
	  WebElement wb =dr.findElement(By.linkText("More"));
	  
	 
	  
  }
  @Test
  public void f() {
	  
  }
  @AfterTest
  public void afterTest() {
  }

}
