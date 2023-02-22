package Project_Mav;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JavaSE {
	WebDriver wd;
  @Test
  public void Testcase1() throws InterruptedException {
	  
	  JavascriptExecutor js = (JavascriptExecutor)wd;//taking the place of webdriver//replacing the place of webdriver with javascript executer
	  Thread.sleep(3000);
	//js.executeScript("history.go(0)");
	  //js.executeScript("window.history.forward(0)");
	  js.executeScript("document.getElementById('userName').value='prati'");
	  js.executeScript("document.getElementById('userEmail').value='naikpratiksha@gmail.com'");
	  js.executeScript("document.getElementById('currentAddress').value='karwar'");
	  js.executeScript("document.getElementById('permanentAddress').value='karwar'");
	 js.executeScript("document.getElementsByClassName('btn btn-primary')[0].click()");//by using class path
	  js.executeScript("window.scrollBy(0,500)");//scrolling the page down
	//  window.scrollBy(0,document.body.scrollHeighgt)another method for scrolling the page up and down
	  System.out.println(js.executeScript("return document.title"));//to get a title of the browser
	  System.out.println(js.executeScript("return document.domain"));//to get the domin as demoqa
	  //System.out.println(js.executeScript("return document.documentElement.innertext"));//to get all the test which is present in that page
	  System.out.println(js.executeScript("return document.getElementById('userName').innertext"));
	  // wd.findElement(By.xpath("//*[@class='btn btn-primary']")).click();we can run the program by using webdriver also
	  /*
	  js.executeScript("document.getElementsByName('username')[0].value='Admin'");
	  js.executeScript("document.getElementsByName('password').value='admin12'");
	  js.executeScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click()");*/
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  wd=new ChromeDriver();
	  //wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.get("https://demoqa.com/text-box");
	  Thread.sleep(3000);
  }

}
