package Toolsqa.ToolsqaTesting;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShotss {
	
	@Test
	public void takescreenshott() throws IOException {
		
		
	       System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://letskodeit.teachable.com/p/practice");
			
			driver.manage().window().maximize();
			
			//implict, explicit. fleunt wait, page load time, thread.sleep
			
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			
			File screnshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						
			FileUtils.copyFile(screnshots, new File("D:\\Trainings\\Test.png"));
			
		
	}

}
