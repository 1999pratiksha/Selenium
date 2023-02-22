package Project_Mav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium-java-4.7.0\\\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://demoqa.com/");
		wd.get("https://demoqa.com/elements");
		wd.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]")).click();
		wd.findElement(By.xpath("//*[@class='card mt-4 top-card'][1]")).click();
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		 
		//wd.findElement(By.xpath(null))
		wd.findElement(By.id("userName")).sendKeys("pratiksha");
		wd.findElement(By.id("userEmail")).sendKeys("naikprati23@gmail.com");
		wd.findElement(By.id("currentAddress")).sendKeys("karwar");
		wd.findElement(By.id("permanentAddress")).sendKeys("karwar");
		wd.findElement(By.xpath("//*[@class='text-right col-md-2 col-sm-12']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2]")).click();
		wd.findElement(By.xpath("//*[@class='rct-icon rct-icon-parent-close']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[3]")).click();
		WebElement ab=wd.findElement(By.id("yesRadio"));
		ab.click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[4]")).click();
		wd.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		
		
		
		

	}

}
