package TJunit.Anno;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGroups {
	
	
	@BeforeSuite
	public void TestBeforeSuite(){
		System.out.println("i m in Before Suite");
		
	}
	
	@AfterSuite
	public void TestAfterSuite(){
		System.out.println("i m in After Suite");
		
	}
	
	@AfterTest
	public void TestAfterTest(){
		System.out.println("i m in After TEst");
		
	}
	
	@org.testng.annotations.AfterClass
	public void TestAfterClass(){
		System.out.println("i m in After Class");
		
	}
	
	@BeforeTest
	public void TestBeforeTest(){
		System.out.println("i m in Before Test");
		
	}
	
	
	@org.testng.annotations.BeforeClass
	public void TestBeforeClass(){
		System.out.println("i m in Before Class");
		
	}
	
	
	@BeforeGroups("Smoke")
     public void TestBeforegroupS(){
		
		System.out.println("I m Before Group Smoke");
	}
	
	
	@AfterGroups("Smoke")
    public void TestAftergroupS(){
		
		System.out.println("I m After SMoke group");
	}
	
	
	@AfterGroups("Regression")
    public void TestAftergroupR(){
		
		System.out.println("I m After group Regression");
	}
	@BeforeGroups("Regression")
    public void TestBeforegroupR(){
		
		System.out.println("I m Before Group Regression");
	}
	
	
	@Test(groups={"Smoke"})
	public void TestG1(){
		
		System.out.println("I m SMoke Test");
	}
	
	@Test(groups={"Regression"})
	public void TestG2(){
		
		System.out.println("I m Regreesion Test");
	}

}
