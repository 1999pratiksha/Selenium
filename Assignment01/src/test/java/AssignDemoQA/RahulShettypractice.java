package AssignDemoQA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class RahulShettypractice {
	WebDriver wc;
	
	public String URL1="https://rahulshettyacademy.com/AutomationPractice/";
 @BeforeTest
public void beforeTest() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 wc=new ChromeDriver();
	 wc.manage().window().maximize();
	 Thread.sleep(3000);
	 wc.get(URL1);
	 wc.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

 @Test(priority=1)
  public void radio() throws InterruptedException 
{
	  wc.findElement(By.xpath("//*[@class='left-align']/fieldset/label[1]/input[1]")).click();
	  Thread.sleep(3000);
	  wc.findElement(By.xpath("//*[@class='left-align']/fieldset/label[2]/input[1]")).click();
	  Thread.sleep(3000);
	  wc.findElement(By.xpath("//*[@class='left-align']/fieldset/label[3]/input[1]")).click();
	  Thread.sleep(3000);
	  
	 //suggestions
	  WebElement ab=wc.findElement(By.id("autocomplete"));
	  Thread.sleep(3000);
	  ab.sendKeys("India");
	  Thread.sleep(3000);
	  ab.sendKeys(Keys.ARROW_DOWN);
	  ab.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(3000);
	  ab.sendKeys(Keys.ENTER);
	 
	 WebElement cd=wc.findElement(By.id("dropdown-class-example"));
	 Thread.sleep(3000);
	 Select sc=new Select(cd);
	 sc.selectByIndex(0);
	 Thread.sleep(3000);
	 sc.selectByIndex(1);
	 Thread.sleep(3000);
	 sc.selectByIndex(2);
	 
	 //for checkbox
	 wc.findElement(By.id("checkBoxOption1")).click();
	 Thread.sleep(3000);
	 wc.findElement(By.id("checkBoxOption2")).click();
	 Thread.sleep(2000);
	 wc.findElement(By.id("checkBoxOption3")).click();  
	 Thread.sleep(2000);
}
  @Test(priority=2)
  public void window() throws InterruptedException 
{
	  String parentWindow =wc.getWindowHandle();
	  System.out.println(parentWindow);
	  wc.findElement(By.xpath("//button[@id='openwindow']")).click();
	  Thread.sleep(5000);
	  wc.switchTo().window(parentWindow);
}
  @Test(priority=3)
  public void tab() throws InterruptedException, AWTException 
{
	  wc.findElement(By.xpath("//a[@id='opentab']")).click();
	  Thread.sleep(3000);
	  Robot rc=new Robot();
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  rc.keyPress(MenuKeyEvent.VK_TAB);
	  rc.keyRelease(MenuKeyEvent.VK_CONTROL);
	  Thread.sleep(3000);
}
  @Test(priority=4)
  public void alerts() throws InterruptedException 
  {
	  wc.findElement(By.xpath("//input[@id='name']")).sendKeys("pratiksha");
	  Thread.sleep(3000);
	  wc.findElement(By.xpath("//input[@id='alertbtn']")).click();
	  Alert alt=wc.switchTo().alert();//switch to alert
	  System.out.println(alt.getText());
	  Thread.sleep(3000);
	  alt.accept();
	  Thread.sleep(3000);
		 //confirm button
     wc.findElement(By.xpath("//input[@id='name']")).sendKeys("pavitra"); 
     Thread.sleep(3000);
	 wc.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	 WebDriverWait wbw = new WebDriverWait(wc, Duration.ofSeconds(180));//explicit wait for 180 seconds
	 wbw.until(ExpectedConditions.alertIsPresent());
	 System.out.println(alt.getText());
	 Thread.sleep(3000);
	 alt.accept();
  }
  @Test(priority=5)
  public void elements() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor) wc;
	  js.executeScript("window.scrollTo(0, 400)");
	  wc.findElement(By.id("hide-textbox")).click();
	  Thread.sleep(5000);
	  wc.findElement(By.id("show-textbox")).click();
	  Thread.sleep(3000);
	  wc.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("pratiksha");
	 
  }
  @Test(priority=6)
  public void mousehover() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor) wc;
	  js.executeScript("window.scrollTo(0,1000)");
	  Actions actions = new Actions(wc);
	  WebElement mouse=wc.findElement(By.xpath("//button[@id='mousehover']"));
	  actions.moveToElement(mouse).perform();
	  mouse.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(3000);
	  actions.click().build().perform();
	  Thread.sleep(3000);
}
  @Test(priority=7)
  public void frames() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor) wc;
	  js.executeScript("window.scrollTo(0,1200)");
	  wc.switchTo().frame("courses-iframe");// Switch By ID 
	  js.executeScript("window.scrollBy(0,900)");
	  
}
  
  @AfterTest
  public void afterTest() {
	  
  }

}
