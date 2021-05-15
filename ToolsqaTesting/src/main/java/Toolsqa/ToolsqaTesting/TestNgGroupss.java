package Toolsqa.ToolsqaTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgGroupss {



@BeforeSuite
public void beforeSuitee() {
		
	System.out.println("beforeSuitee");
}



@Test(priority=1, enabled= true, groups= {"sanity"})
public void Testt1() {
	
	System.out.println("Testt1");
	
}

@Test(priority=2, enabled= true, groups= {"Regression"})
public void Testt2() {
	
	System.out.println("Testt2");
	
}

@Test(priority=3, enabled= true, groups= {"Functional"})
public void Testt3() {
	
	System.out.println("Testt3");
	
 }
}
