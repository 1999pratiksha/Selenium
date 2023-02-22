package pratipackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class prati {
	public static void main(String[] args) throws InterruptedException{//String used to pass the arguments in the main method
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");//setting the path for chrome driver
		//WebDriver wd= new ChromeDriver();
		 WebDriver wd = new ChromeDriver();//setting the object for chrome driver
		 wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//telling chrome navigator to open a orangehrm website
		 Thread.sleep(3000);
		 wd.findElement(By.xpath("//*[@name=\'username\']")).sendKeys("Admin");
		 //wd.findElement(By.name("username")).sendKeys("Admin"); Two methods can be used.
		 wd.findElement(By.name("password")).sendKeys("admin123");
		 wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		 //wd.findElement(By.xpath("//*[@class=\'oxd-main-menu-item active\']")).click();
		 Thread.sleep(3000);
		 wd.findElement(By.linkText("Admin")).click();
		 Thread.sleep(3000);
		 wd.findElement(By.linkText("Dashboard")).click();
		 Thread.sleep(3000);
		// wd.findElement(By.xpath("*[@class=\'oxd-text oxd-text--span oxd-main-menu-item--name\'])[2]")).click();
		 
		 
		 
	}
}