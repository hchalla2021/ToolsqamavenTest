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

public class TestNgAnnatation {

@BeforeMethod	
public void beforeMethodd() {
	
	System.out.println("beforeMethodd");
		
}

@BeforeSuite
public void beforeSuitee() {
		
	System.out.println("beforeSuitee");
}

@BeforeTest
public void beforeTestt() {
	
	System.out.println("beforeTestt");
	
}

@BeforeClass
public void beforeclasss() {
	
	System.out.println("beforeclasss");
	
}

@AfterSuite
public void AfterSuitee() {
	
	System.out.println("AfterSuitee");
}
@AfterClass
public void Afterclass() {
	
	System.out.println("Afterclass");
	
}
@Test(priority=1, enabled= false)
public void Testt1() {
	
	System.out.println("Testt1");
	
}

@Test(priority=2)
public void Testt2() {
	
	System.out.println("Testt2");
	
}

@Test(priority=3)
public void Testt3() {
	
	System.out.println("Testt3");
	
}
@AfterMethod
public void AfterMethodd() {
	
	System.out.println("AfterMethodd");
}
@AfterTest
public void Aftertestt() {
	
	System.out.println("Aftertestt");
   }
}
