package MoreAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class TestGroup {

	
	@BeforeGroups("Selenium")
	public void TestBeforeGroup(){
		System.out.println("I m in Before Group");
	}
	
	
	@Test(groups="Selenium")
	public void Test1(){
		
		System.out.println("I m in Test 1");
	}
	
	@Test(groups="DBGroup")
	public void Test3(){
		
		System.out.println("I m in Test 1");
	}
	
	@Test(dependsOnGroups={"Selenium"})
	public void TestDependency(){
		System.out.println("Run after Selenium Group will execute");
	}
	
	@Test(groups="Selenium1")
	public void Test2(){
		
		System.out.println("I m in Test 2");
	}
	
	
	@AfterGroups("Selenium")
	public void TestAfterGroup(){
		System.out.println("I am in after Group");
	}
	
	
}
