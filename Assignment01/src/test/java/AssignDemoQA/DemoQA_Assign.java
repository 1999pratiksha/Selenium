package AssignDemoQA;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class DemoQA_Assign {
	WebDriver wd;
@BeforeTest
  public void beforeTest() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  wd = new ChromeDriver();
		  wd.manage().window().maximize();
		  Thread.sleep(3000);
		  }
  
 @Test(enabled=false)
  public void Textbox() throws AWTException, InterruptedException 
 {
	    wd.navigate().to("https://demoqa.com/");
		wd.manage().window().maximize();	
		Thread.sleep(1000);
		Robot rc=new Robot();
		//rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	    wd.get("https://demoqa.com/elements");
	    rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[1]")).click();
		Thread.sleep(3000);
		wd.findElement(By.id("userName")).sendKeys("pratiksha");
		wd.findElement(By.id("userEmail")).sendKeys("naikprati23@gmail.com");
		wd.findElement(By.id("currentAddress")).sendKeys("karwar");
		wd.findElement(By.id("permanentAddress")).sendKeys("karwar");
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]")).click();
		Thread.sleep(3000); 
  }
@Test(enabled=false)
  public void Checkbox() throws InterruptedException, AWTException 
{
	  Thread.sleep(3000);
	  wd.get("https://demoqa.com/checkbox");
	  //wd.findElement(By.xpath("//*[@class='card mt-4 top-card'][1]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2]")).click();
	  wd.findElement(By.xpath("//*[@class='rct-icon rct-icon-parent-close']")).click();
  }
@Test(enabled=false)
  public void RadioButton() throws InterruptedException 
{
	  wd.get("https://demoqa.com/radio-button");
	  Thread.sleep(3000);
	  //wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[3]")).click();  
	  //Thread.sleep(3000);
	  wd.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();
 }
  
@Test(enabled=false)
  public void Webtables() throws InterruptedException, AWTException 
{
   wd.get("https://demoqa.com/webtables");
   Robot rc=new Robot();
   Thread.sleep(3000);
   wd.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
    Thread.sleep(3000);
	wd.findElement(By.id("firstName")).sendKeys("pratiksha");
	wd.findElement(By.id("lastName")).sendKeys("Naik");
	wd.findElement(By.id("userEmail")).sendKeys("Naikprati23@gmail.com");
	wd.findElement(By.id("age")).sendKeys("22");
	wd.findElement(By.id("salary")).sendKeys("20000");
	wd.findElement(By.id("department")).sendKeys("Testing");
	Thread.sleep(3000);
	rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	wd.findElement(By.id("submit")).click();
	Thread.sleep(4000);
	wd.findElement(By.id("delete-record-1")).click();
	 Thread.sleep(3000);
  }
  
@Test(enabled=false)
  public void links() throws InterruptedException 
{
	  wd.get("https://demoqa.com/links");
	  Thread.sleep(3000);
	  String parentWindow =wd.getWindowHandle();
	  System.out.println(parentWindow);
	  wd.findElement(By.id("simpleLink")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("dynamicLink")).click();
	  Thread.sleep(3000);
	  wd.navigate().refresh();
	  Thread.sleep(3000);
	  wd.switchTo().window(parentWindow);
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor) wd;
	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  wd.findElement(By.id("created")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("no-content")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("moved")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("bad-request")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("unauthorized")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("forbidden")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("invalid-url")).click();
	  Thread.sleep(3000);
	  
 }
@Test(enabled=false)
  public void broken() throws InterruptedException 
{
	   wd.get("https://demoqa.com/broken");
	   Thread.sleep(3000);
	   JavascriptExecutor js = (JavascriptExecutor) wd;
	   js.executeScript("window.scrollTo(0, 400)");
	   Thread.sleep(3000);
	   wd.findElement(By.xpath("//a[contains(text(),'Click Here for Broken Link')]")).click();
	   Thread.sleep(3000);
	   wd.navigate().back();
	   Thread.sleep(3000);
	   wd.findElement(By.xpath("//a[contains(text(),'Click Here for Valid Link')]")).click();
	  
}
   
@Test(enabled=false)
   public void upload() throws InterruptedException 
{
	   wd.get("https://demoqa.com/upload-download");
	   Thread.sleep(3000);
	   wd.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\naikp\\OneDrive\\Pictures\\Screenshots\\bug2.png");
	   wd.findElement(By.xpath("//a[@id='downloadButton']")).click();
}
   
   
 @Test(enabled=false)
   public void DynamicProper() throws InterruptedException 
{
	   Thread.sleep(3000);
	   wd.get("https://demoqa.com/dynamic-properties");
	   JavascriptExecutor js = (JavascriptExecutor) wd;
	   js.executeScript("window.scrollTo(0, 200)");
	   wd.findElement(By.xpath("//button[@id='enableAfter']")).click();
	   Thread.sleep(5000);
   }
   
@Test(enabled=false)
   public void Forms() throws InterruptedException {
	   wd.get("https://demoqa.com/automation-practice-form");
	   wd.findElement(By.xpath("//input[@id='firstName']")).sendKeys("pratiksha");
	   wd.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Naik");
	   wd.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Naikprati23@gmail.com");
	   Thread.sleep(5000);
	   wd.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	   Thread.sleep(5000);
	   JavascriptExecutor js = (JavascriptExecutor) wd;
	   js.executeScript("window.scrollTo(0, 400)");
	   //mob
	   Thread.sleep(2000);
	   wd.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("6360476957");
	   //dob
	   wd.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	   Thread.sleep(5000);
	  
	   WebElement month_dropdown = wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
	   Select month=new Select(month_dropdown);
	   month.selectByVisibleText("March");
	   Thread.sleep(5000);
	   //year
	   WebElement year_dropdown = wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
	   Select year=new Select(year_dropdown);
	   year.selectByVisibleText("1999");
	   wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]")).click();
	   Thread.sleep(5000);
	   //autocomplete sub
	   WebElement products=wd.findElement(By.id("subjectsInput"));
	   products.sendKeys("English");
	   products.sendKeys(Keys.ARROW_DOWN);
	   products.sendKeys(Keys.ENTER);
	   products.sendKeys("Maths");
	   products.sendKeys(Keys.ARROW_DOWN);
	   products.sendKeys(Keys.ENTER);
	   Thread.sleep(5000);
	   //hobbies
	   wd.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
	   //upload file
	   Thread.sleep(5000);
	   wd.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\naikp\\OneDrive\\Pictures\\Screenshots\\bug1.png");
		//address
	   wd.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("karwar,karnataka");
	   Thread.sleep(3000);
	
	   WebElement submit=wd.findElement(By.id("subjectsInput"));
	   submit.sendKeys("Karwar");
	   submit.sendKeys(Keys.ARROW_DOWN);
	   submit.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   
}
@Test(enabled=false)
   
   public void BrowserWindow() throws InterruptedException, AWTException 
{
	   wd.get("https://demoqa.com/browser-windows");
	   Thread.sleep(5000);
	   Robot rc=new Robot();
		  rc.keyPress(MenuKeyEvent.VK_DOWN);
		  wd.findElement(By.id("tabButton")).click();//clicking on new tab
		  Thread.sleep(3000);
		  rc.keyPress(MenuKeyEvent.VK_CONTROL);//by giving control tab it tab it will move to nxtpage
		  rc.keyPress(MenuKeyEvent.VK_TAB);
		  rc.keyRelease(MenuKeyEvent.VK_CONTROL);
		  Thread.sleep(3000);
		  rc.keyPress(MenuKeyEvent.VK_DOWN);
		  for(int i=0;i<3;i++)//For loop to check whether new window appears for 3times
		  {
	      wd.findElement(By.id("windowButton")).click();
		  Thread.sleep(1000);
		  }
		  
		  Thread.sleep(3000);
		  String p_window = wd.getWindowHandle();//this one gets the window handle (id) id of parent window
		  System.out.println(p_window);//print the same id.
		  Set<String> allwin =wd.getWindowHandles();//String we can store number of data
		  System.out.println(allwin);//getting the all id
		  System.out.println(allwin.size());//getting count of the id
		  Thread.sleep(3000);
		  String lastwindow="";
		  for(String handle: allwin)
		  {
			  wd.switchTo().window(handle);
			  wd.get("https://www.google.com/");
			 lastwindow=handle;
		  }
		  Thread.sleep(3000);
		  wd.switchTo().window(p_window);
		  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  wd.close();
		  wd.switchTo().window(lastwindow);
		  wd.get("https://www.gmail.com/");
		  wd.findElement(By.id("messageWindowButton")).click();
		  Thread.sleep(4000);
		  wd.navigate().back();
		  Thread.sleep(4000);
}

@Test(enabled=false)
   public void Alerts() throws InterruptedException, AWTException 
{
	     wd.get("https://demoqa.com/alerts");
	     Thread.sleep(3000);
	     wd.findElement(By.id("alertButton")).click();//clicking on the alert
		 Alert alt=wd.switchTo().alert();//switch to alert
		 System.out.println(alt.getText());
		 Thread.sleep(3000);
		 alt.accept();//accept is for clicking on ok or yes
		 wd.findElement(By.id("timerAlertButton")).click();//
		 wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		 WebDriverWait wbw = new WebDriverWait(wd, Duration.ofSeconds(180));//explicit wait for 180 seconds
		 wbw.until(ExpectedConditions.alertIsPresent());//you are telling the web driver to accept or press ok only after the pop up appears
		 System.out.println(alt.getText());
		 Thread.sleep(3000);
		 alt.accept();//clicking ok*/
		 Actions act= new Actions(wd);
		 Robot rc= new Robot();
		 JavascriptExecutor js = (JavascriptExecutor) wd;
		 js.executeScript("window.scrollTo(0, 400)");
		 wd.findElement(By.id("confirmButton")).click();
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(3000);
		 alt.dismiss();
		 Thread.sleep(3000);
		 wd.findElement(By.id("promtButton")).click();
		 Thread.sleep(3000);
		 alt.sendKeys("prati");
		 alt.accept();
		 
}
   @Test(enabled=false)
   public void Frames() throws InterruptedException {
	   wd.get("https://demoqa.com/frames");
	   Thread.sleep(3000);
	   JavascriptExecutor js=(JavascriptExecutor)wd;
	   js.executeScript("window.scrollTo(0, 400)");
	   List<WebElement> frame=wd.findElements(By.tagName("iframe"));
		System.out.println(frame.size());//size of frames will be displayed
		for(int i=0;i<8;i++) {
			String str=frame.get(i).getAttribute("id");
		}
	   wd.switchTo().frame("frame2");
	   js.executeScript("window.scrollBy(0,500)");
}
  
   @Test(enabled=false)
   public void modaldialogs() throws InterruptedException
{
	   wd.get("https://demoqa.com/modal-dialogs");
	   Thread.sleep(3000);
	   wd.findElement(By.xpath("//button[@id='showSmallModal']")).click();
	   Thread.sleep(3000);
	   wd.findElement(By.xpath("//button[@id='closeSmallModal']")).click();
	   Thread.sleep(3000);
	   wd.findElement(By.xpath("//button[@id='showLargeModal']")).click();
	   Thread.sleep(2000);
	   wd.findElement(By.xpath("//button[@id='closeLargeModal']")).click();
}
   @Test(enabled=false)
   public void Autocomplete() throws InterruptedException {
	   wd.get("https://demoqa.com/auto-complete");
	   Thread.sleep(3000);
	   WebElement select=wd.findElement(By.xpath("//div[@id='autoCompleteMultipleContainer']"));
	   Thread.sleep(1000);
	   select.sendKeys("Red");
	   Thread.sleep(1000);
	   select.sendKeys(Keys.ARROW_DOWN);
	   select.sendKeys(Keys.ENTER);
	   WebElement select1= wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	   Thread.sleep(1000);
	   select1.sendKeys("R");
	   Thread.sleep(1000);
	   select1.sendKeys(Keys.ARROW_DOWN);
	   select1.sendKeys(Keys.ENTER);
}
   @Test(enabled=false)
   public void Datepicker() throws InterruptedException 
{
	   wd.get("https://demoqa.com/date-picker");
	   wd.findElement(By.id("datePickerMonthYearInput")).click();
	   WebElement month_dropdown = wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
	   Select month=new Select(month_dropdown);
	   month.selectByVisibleText("March");
	   WebElement Year_dropdown= wd.findElement(By.xpath("//*[@class='react-datepicker__year-select']"));
	   Select year=new Select(Year_dropdown);
	   year.selectByVisibleText("2021");
	   Thread.sleep(1000);
	   wd.findElement(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--016']")).click();
	  wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]")).click();;
}
   @Test(enabled=false)
   public void Slider() throws InterruptedException 
{
	   wd.get("https://demoqa.com/slider");
	   Actions actions = new Actions(wd);
	   Thread.sleep(1000);
	   WebElement slider = wd.findElement(By.xpath("//*[@class='range-slider range-slider--primary']"));
	   actions.moveToElement(slider, 50, 0).perform();
	   slider.click();
   	  System.out.println("Moved slider in horizontal directions");
}
   @Test(enabled=false)
   public void Progressbar() throws InterruptedException 
{
	   wd.get("https://demoqa.com/progress-bar");  
	   wd.findElement(By.id("startStopButton")).click();
	   WebElement Progressbar=wd.findElement(By.xpath("//*[@role='progressbar']"));
	   WebDriverWait wait= new WebDriverWait(wd, Duration.ofSeconds(60));
	  boolean progressststus=wait.until(ExpectedConditions.attributeToBe(Progressbar, "aria-valuemax", "100"));
	  if(progressststus==true) {
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@button='resetButton']"))).click();
 }
}
   @Test(enabled=false)
   public void Mousehover() throws InterruptedException 
{
	   wd.get("https://demoqa.com/tool-tips");
	  WebElement mousehover= wd.findElement(By.xpath("//button[@id='toolTipButton']"));
	  Actions actions = new Actions(wd);
	  actions.moveToElement(mousehover).perform();
	  WebElement texthover=wd.findElement(By.xpath("//input[@id='toolTipTextField']"));
	  actions.moveToElement(texthover).perform();
}
   @Test(enabled=false)
   public void Resizable() throws InterruptedException 
{
	   wd.get("https://demoqa.com/resizable");
	   Thread.sleep(1000);
	   WebElement resize= wd.findElement(By.xpath("//*[@class='react-resizable-handle react-resizable-handle-se'][1]"));
	   Actions act= new Actions(wd);
	   Thread.sleep(1000);
	   act.dragAndDropBy(resize, 80, 120).perform();
	   JavascriptExecutor js = (JavascriptExecutor) wd;
	   js.executeScript("window.scrollTo(0, 400)");
	   Thread.sleep(1000);
	   WebElement resize2=wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/span[1]"));
	   act.dragAndDropBy(resize2, 450, 330);
}
   @Test(enabled=false)
   public void Dragdrop() throws InterruptedException 
{
	  wd.get("https://demoqa.com/droppable");
	  Thread.sleep(2000);
	  WebElement drag=wd.findElement(By.id("draggable"));
	  WebElement drop=wd.findElement(By.id("droppable"));
	  Actions act= new Actions(wd);
	  act.dragAndDrop(drag, drop).build().perform();
}
   @Test(enabled=false)
   public void Drag() throws InterruptedException 
{
	  wd.get("https://demoqa.com/dragabble");
	  Thread.sleep(2000);
	  WebElement drag=wd.findElement(By.id("dragBox"));
	  Actions act= new Actions(wd);
	  act.clickAndHold().moveByOffset(287, 96).build().perform();
}
   @Test(enabled=false)
   public void Select() throws InterruptedException 
{
	  wd.get("https://demoqa.com/selectable");
	  Thread.sleep(2000); 
	  WebElement sel=wd.findElement(By.xpath("//*[@class='tab-content']/div/ul/li"));  
	  sel.click();
	  Select sc= new Select(sel);
	  JavascriptExecutor js = (JavascriptExecutor) wd;
	  js.executeScript("window.scrollTo(0, 700)");
	  Thread.sleep(2000); 
	  sc.selectByVisibleText("Cras justo odio");
	  sc.selectByVisibleText("Morbi leo risus");
}
   @Test (enabled = true)
   public void Sortable() throws InterruptedException, AWTException 
{
 	  wd.get("https://demoqa.com/sortable");
 	  Thread.sleep(2000);
 	  JavascriptExecutor js = (JavascriptExecutor)wd;
 	  js.executeScript("window.scrollBy(0,200)");
 	  Thread.sleep(2000);
 	  Actions action=new Actions(wd);
 	  List<WebElement> elements=wd.findElements(By.xpath("//*[@id=\'demo-tabpane-list\']/div/div"));
 	  for(int i =0;i<elements.size();i++) {
 	  action.dragAndDrop(elements.get(0),elements.get(i)).build().perform();
 	  }
}
  @AfterTest
  public void afterTest() {
  }

}
