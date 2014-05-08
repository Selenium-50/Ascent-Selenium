package JavaScriptExecutor;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;

public class JS2 {

	@Test
	public void Test1(){
		
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('HI')");
		
		driver.switchTo().alert().accept();
		driver.quit();
	}
	
	
	@Test
	public void Test2(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=(String)js.executeScript("return document.title");
		
		System.out.println("Title is "+title);
		driver.quit();
	}
	
	
	@Test
	public void Test3(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String domain=(String)js.executeScript("return document.domain");
		
		System.out.println("Title is "+domain);
		driver.quit();
	}
	
	@Test
	public void Test4(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String domain=(String)js.executeScript("return document.URL");
		
		System.out.println("URL is "+domain);
		driver.quit();
	}
	
	@Test
	public void Test5(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Object obj=((JavascriptExecutor)driver).executeScript("return document.getElementById('main');");
		
	String name=	((WebElement)obj).getAttribute("class");
	System.out.println("My Attribute name is"+name);
	driver.quit();
	}
	
	@Test
	public void Test6(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	JavascriptExecutor js	=(JavascriptExecutor)driver;
	String str=      (String) js.executeScript("return document.lastModified");
		System.out.println("last modified by"+str);
		driver.quit();

	}
	
	
	
}
