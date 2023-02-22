package Project_Mav;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import javax.swing.event.InternalFrameAdapter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames{
	WebDriver wd;
	@BeforeTest
	public void beforetest() {
		
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("https://demoqa.com/frames");
		
	}
	@Test
	public void Frames() throws AWTException {
		JavascriptExecutor js=(JavascriptExecutor)wd;
		List<WebElement> frame=wd.findElements(By.tagName("iframe"));//here find elements is used because here number of frmes are there
		//declaring webelement frame and storing the tag name list is used because in find element's'are used
		System.out.println(frame.size());//size of frames will be displayed
		for(int i=0;i<8;i++) {
			String str=frame.get(i).getAttribute("id");
		}
		wd.switchTo().frame("frame2");
		js.executeScript("window.scrollBy(0,500)");
		
		
		
	}

}
