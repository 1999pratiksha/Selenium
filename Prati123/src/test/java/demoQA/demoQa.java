package demoQA;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class demoQa {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	//System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		//WebDriver wb= new ChromeDriver();
		//wb.navigate().to("https://demoqa.com/");
		//Robot rc=new Robot();
		//rc.keyPress(MenuKeyEvent.VK_DOWN);
		//wb.findElement(By.xpath("//*[@class=\'category-cards'\]/div[1]")).click();
		//rc.keyPress(MenuKeyEvent.VK_DOWN);
		//Thread.sleep(3000);
		//wb.findElement(By.xpath("//*[@class='left-pannel']/div/div[5]")).click();
		//Thread.sleep(3000);
		//wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[4]")).click();
		//WebElement link= wb.findElement(By.id("draggable"));
		//WebElement link1=wb.findElement(By.id("droppable"));
		//Actions act= new Actions(wb);
		//act.dragAndDrop(link, link1).build().perform();
		//Thread.sleep(3000);
		//wb.close();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		Actions act = new Actions(wd);
		Robot rb = new Robot();
		wd.manage().window().maximize();
		 wd.navigate().to("https://demoqa.com/");
		 //wd.navigate().to("https://demoqa.com/droppable");
		 Thread.sleep(2000);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 wd.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]")).click();
		 Thread.sleep(5000);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
	     rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(5000);
		 wd.findElement(By.xpath("(//*[@class=\'header-right\'])[5]")).click();
		 Thread.sleep(5000);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 wd.findElement(By.xpath("(//*[@class=\'btn btn-light \'])[28]")).click();
		 Thread.sleep(3000);
		 WebElement we= wd.findElement(By.xpath("(//*[@id=\'draggable\'])"));
		 WebElement xz=wd.findElement(By.xpath("(//*[@id=\'droppable\'])"));
		 Actions ac=new Actions(wd);
		 ac.dragAndDrop(we, xz).perform();
		 Thread.sleep(5000);
		 wd.close();
	
	

		
		
		
	}

}
