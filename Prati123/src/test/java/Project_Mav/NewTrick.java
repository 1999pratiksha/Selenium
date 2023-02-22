package Project_Mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import   org.openqa.selenium.Alert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTrick {
	WebDriver wb;
	public String URL1="https://demoqa.com/upload-download";
	public String URL2="https://demoqa.com/alerts";
	public String URL3="https://demoqa.com/browser-windows";
	
@Test(enabled=false)
 public void Uploading_a_file() {
		wb.get(URL1);
		wb.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\naikp\\OneDrive\\Pictures\\Screenshots\\Screenshot (18).png");//uploading files
 }
  @Test(enabled=false)
  public void Alert() throws InterruptedException, AWTException {
	  wb.get(URL2);
	  wb.findElement(By.id("alertButton")).click();//clicking on the alert
	 Alert alt=wb.switchTo().alert();//switch to alert
	 System.out.println(alt.getText());
	 Thread.sleep(3000);
	 alt.accept();//accept is for clicking on ok or yes
	 
	 wb.findElement(By.id("timerAlertButton")).click();//
	 wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
	 WebDriverWait wbw= new WebDriverWait(wb, 180);//explicit wait for 180 seconds
	 wbw.until(ExpectedConditions.alertIsPresent());//you are telling the web driver to accept or press ok only after the pop up appears
	 System.out.println(alt.getText());
	 alt.accept();//clicking ok
	 Actions act= new Actions(wb);
	 Robot rc= new Robot();
	 
	 wb.findElement(By.id("confirmButton")).click();
	 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	  Thread.sleep(3000);
	  alt.dismiss();
	 
	  wb.findElement(By.id("promtButton")).click();
	  Thread.sleep(3000);
	  alt.sendKeys("prati");
	  alt.accept();
	 
	  
	  Thread.sleep(3000);
	

  }
  @Test(enabled=true)
  public void Browser() throws InterruptedException, AWTException {
	  wb.get(URL3);
	  Thread.sleep(3000);
	  Robot rc=new Robot();
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  wb.findElement(By.id("tabButton")).click();//clicking on new tab
	  Thread.sleep(3000);
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);//by giving control tab it tab it will move to nxtpage
	  rc.keyPress(MenuKeyEvent.VK_TAB);
	  rc.keyRelease(MenuKeyEvent.VK_CONTROL);
	  Thread.sleep(3000);
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  for(int i=0;i<3;i++)//For loop to check whether new window appears for 3times
	  {
      wb.findElement(By.id("windowButton")).click();
	  Thread.sleep(1000);
	  }
	  
	  Thread.sleep(3000);
	  String p_window = wb.getWindowHandle();//this one gets the window handle (id) id of parent window
	  System.out.println(p_window);//print the same id.
	  Set<String> allwin =wb.getWindowHandles();//String we can store number of data
	  System.out.println(allwin);//getting the all id
	  System.out.println(allwin.size());//getting count of the id
	  Thread.sleep(3000);
	  String lastwindow="";
	  for(String handle: allwin)
	  {
		  wb.switchTo().window(handle);
		  wb.get("https://www.google.com/");
		 lastwindow=handle;
	  }
	  Thread.sleep(3000);
	  wb.switchTo().window(p_window);
	  wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wb.close();
	  wb.switchTo().window(lastwindow);
	  wb.get("https://www.gmail.com/");
	  
	 /* wb.findElement(By.id("messageWindowButton")).click();
	  Thread.sleep(4000);
	  wb.quit();*/
	  
 }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
  }
  
}
