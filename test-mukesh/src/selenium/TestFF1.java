package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFF1 {

	
	@Test
	public void Testf(){
		
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.id("email"));
	String originalStyle = element.getAttribute("style");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid red;');", element);
	  
	  try {
	    Thread.sleep(1000);
	  } 
	  catch (InterruptedException e) {}
	  
	  js.executeScript("arguments[0].setAttribute('style', '" + originalStyle + "');", element);
element.sendKeys("TestTest");

	
		
	}
	
}
