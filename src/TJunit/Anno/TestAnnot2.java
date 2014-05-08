package TJunit.Anno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class TestAnnot2 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void TestSbuite(){
		System.out.println("Suite is Ready to user");
	}
	
	@AfterSuite
	public void TestCloseSuite(){
		System.out.println("Suite is Closed and Report is generated");
	}
	
	
	@BeforeTest
	public void TestSetup(){
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	}
	
	@AfterTest
	public void TestQuit(){
		driver.quit();
	}
	
	
	
	@Test(priority=1)
	public void TestOpen(){
		driver.get("http://www.facebook.com");
	}
	
	@Test(priority=2)
	public void TypeUsername(){

driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");

	}
	
	
	@Test(priority=3)
	public void TypePassword(){
		driver.findElement(By.id("pass")).sendKeys("testpassword");
	}
	
	@Test(priority=4)
	public void Testlogin(){
	driver.findElement(By.id("loginbutton")).click();
			
			
			
			
	}
	
	@Test(priority=5)
	public void TestLogout(){
		Assert.assertEquals('a','b');
		System.out.println("Done Logout");
	}
	@Test(priority=5,dependsOnMethods={"TestLogout"})
	public void TestCloseEClise(){
		System.out.println("Done Logout");
	}
}
