package TestingFrames;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFrame1 {
	
	@Test
public void Test1(){
	
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://partnerportal2013.dell.com/sites/channel/Pages/index.aspx?c=0");
		new Select(driver.findElement(By.xpath(".//*[@id='ddlCountry']"))).selectByVisibleText("United States");
		driver.findElement(By.id("imgGo")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath(".//*[@id='UserName']")).sendKeys("Testmukesh@gmail.com");
		driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("TestTest");
		driver.findElement(By.xpath(".//*[@id='btnSubmitSignInForm']")).click();
}
}
