package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MavTestng {
  WebDriver dr;
  String URL1 ="https://www.google.com/";
  String URL2= "https://www.amazon.in/";
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  dr=new ChromeDriver();
	  //dr.navigate().to(URL1);
	  dr.get(URL1);//Two ways to navigate website
  }
  
  @Test
  public void Actions() throws AWTException {
	 WebElement link= dr.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
	  link.click();
	 Actions act= new org.openqa.selenium.interactions.Actions(dr);
	  act.contextClick().build().perform();
	  Robot rc= new Robot();
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  rc.keyPress(MenuKeyEvent.VK_ENTER);
	  
  }

  @AfterTest
  public void afterTest() {
	  dr.close();
  }

}
