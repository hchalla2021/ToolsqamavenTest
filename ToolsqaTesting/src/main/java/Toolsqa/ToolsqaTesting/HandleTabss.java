package Toolsqa.ToolsqaTesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HandleTabss {

	public static String name = "Selenium2021";
	
	public static WebDriver driver;
	
	@Test(priority=1)
	public void Tabswitch() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		Reporter.log("Application launched successfull by using url of " +" " + "https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		//implict, explicit. fleunt wait, page load time, thread.sleep
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
			
		ArrayList<String> listoftabs = new ArrayList<String>(driver.getWindowHandles());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(listoftabs.get(1)); // new tab
		
		String gettabtext = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
		
		System.out.println("New tab text is " + gettabtext);
		
		driver.close();
		
		driver.switchTo().window(listoftabs.get(0)); // old tab	
	}

	@Test(priority=2)
	public void quitt() {
	
		driver.quit();
		
	}
}
