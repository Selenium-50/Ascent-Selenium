package MoreAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMethod {

	
	@BeforeMethod
	public void TestBeforeMethod(){
		System.out.println("I m in Before Method");
	}
	
	@Test
	public void Test1(){
		System.out.println("This is Test 1");
	}
	
	@Test
	public void Test2(){
		System.out.println("This is Test 2");
		
	}
	
	@Test
	public void Test3(){
		System.out.println("This is Test 3");
		
	}
	
	@AfterMethod
	public void TestAfterMethod(){
		System.out.println("I m in after  Method");
	}
}
