package Project_Mav;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertEquals;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;
import org.testng.Assert;

public class orangeHrm {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		 wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		String Actual_title=wd.getTitle();
		//System.out.println(Actual_title);
		String Expect_title="OrangeHRM";
		Assert.assertEquals(Actual_title, Expect_title);
		File scr=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:/Users/naikp/OneDrive/Pictures/sccreen.jpg"));//clicking screenshot
	
	}

}
