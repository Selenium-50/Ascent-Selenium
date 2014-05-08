package selenium;

import org.junit.AfterClass;
import org.junit.ClassRule;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestActions {

	WebDriver driver=null;
	
	@BeforeClass
public void TestSetup(){
		System.out.println("Before Class");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		
	}
	
	@Test
	public void TestAc() throws Exception{
		System.out.println("Test");
		//driver.findElement(By.xpath("")).sendKeys("testmukesh");
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.xpath(".//*[@id='u_0_1']"))).sendKeys(Keys.TAB).sendKeys("test lastname").sendKeys(Keys.TAB).sendKeys("Test Email").sendKeys(Keys.TAB).sendKeys("Test Reemail").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		Thread.sleep(10000);
		
		
	}
	
	@AfterClass
	public void TestQuit(){
		System.out.println("After Class");
		
		
	}
	
	@AfterTest
	public void TestReport(){
		driver.quit();
		System.setProperty("webdriver.chrome.driver", "C:\\Servers\\chromedriver2.8\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("file:///C:/Users/Mukesh_Otwani/Desktop/Mukesh@DeLL/Selenium%20Traning/feb7/DemoProject/test-output/emailable-report.html");
		driver1.manage().window().maximize();
		
	}
}
