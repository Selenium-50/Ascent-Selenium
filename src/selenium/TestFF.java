package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFF {

	@Test
	public  void testdemo() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	WebElement ele1=driver.findElement(By.xpath(".//*[@id='email']"));
	String original=	ele1.getAttribute("style");
	JavascriptExecutor js=	(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid red;');", ele1);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	js.executeScript("arguments[0].setAttribute('style', ' "+ original + "');", ele1);
	ele1.sendKeys("testtesttest");

	
	
	
		driver.quit();

	}

}
