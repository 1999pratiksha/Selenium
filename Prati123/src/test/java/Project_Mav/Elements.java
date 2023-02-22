package Project_Mav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Elements {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		Robot rc= new Robot();
		Actions act = new Actions(wb);
		//open the website
		wb.navigate().to("https://demoqa.com/");
		 wb.manage().window().maximize();	
		Thread.sleep(1000);
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		//clicking on Home elements
		wb.findElement(By.xpath("//*[@class='card mt-4 top-card'][1]")).click();
		Thread.sleep(3000);
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(3000);
		 
		//for clicking on check box
		wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2]")).click();
		wb.findElement(By.xpath("//*[@class='rct-icon rct-icon-parent-close']")).click();
		
		
		//clicking On Radio buttons
		/* Thread.sleep(3000);

		 WebElement radioElement = wb.findElement(By.id("impressiveRadio"));
		 boolean selectState = radioElement.isSelected();
		 Thread.sleep(3000);*/
		
		
		//clicking on webtables
		/*wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[4]")).click();
		wb.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		 Thread.sleep(3000);
		wb.findElement(By.id("firstName")).sendKeys("pratiksha");
		wb.findElement(By.id("lastName")).sendKeys("Naik");
		wb.findElement(By.id("userEmail")).sendKeys("Naikprati23@gmail.com");
		wb.findElement(By.id("age")).sendKeys("22");
		wb.findElement(By.id("salary")).sendKeys("20000";
		wb.findElement(By.id("department")).sendKeys("Testing");
		Thread.sleep(3000);
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		wb.findElement(By.id("submit")).click();*/
		 
		//Deleting the records
		/* wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[4]")).click();
		 wb.findElement(By.id("delete-record-1")).click();
		 Thread.sleep(3000);*/
		 
		
		//Double click perform
		/*wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[5]")).click();
		 Thread.sleep(3000);
		 WebElement ab=wb.findElement(By.xpath("//*[@class='btn btn-primary'][1]"));
		 act.doubleClick(ab).perform();
		 
		 Thread.sleep(3000);
		 WebElement btn= wb.findElement(By.id("rightClickBtn"));
		 act.contextClick(btn).perform();
		 Thread.sleep(3000);
		 
		 wb.findElement(By.name("Click Me"));
		 act.click();*/
		 
		// clicking on links
		/* wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[6]")).click();
		 Thread.sleep(3000);
	     wb.findElement(By.id("simpleLink")).click();
		 Thread.sleep(3000);
		 wb.findElement(By.id("dynamicLink")).click();
		 Thread.sleep(3000);
		 wb.navigate().refresh();
		 Thread.sleep(3000);
         wb.navigate().to("https://demoqa.com/links");
		 wb.findElement(By.id("created")).click();*/
		
		
		
		
		
		
		
		

}

}
