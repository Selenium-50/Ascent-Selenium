package TJunit.Anno;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestAnno1 {
	
	@Before
	public void TestSetup(){
		System.out.println("Application in running");
	}
	
	@After
	public void TestQuit(){
		System.out.println("Applicaion is Down");
	}
	
	@BeforeClass
	public static void TestBeforeClass(){
		System.out.println("I am in Before Class annotation");
	}
	
	@AfterClass
	public static void TestAfterClass(){
		System.out.println("I am in After Class annotation");
	}
	
	@Test
	public void TestOpen(){
		System.out.println("Page Loaded");
	}
	
	@Test
	public void TestLogin(){
		System.out.println("Login Done");
	}
	
	
	@Test
	public void TestVerifyTitle(){
		System.out.println("Verified title");
	}
	
	@Test
	public void TestCreateUsers(){
		System.out.println("User Created");
	}
	
	@Test
	public void TestLogout(){
		System.out.println("Done Logout");
	}
}
