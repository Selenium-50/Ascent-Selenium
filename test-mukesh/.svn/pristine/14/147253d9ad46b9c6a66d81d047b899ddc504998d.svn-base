package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mYNTRA {

	@Test
	public void TestLogin(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.myntra.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/header/div/div[3]/a")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div/div[1]/div[1]/div[5]/form[1]/input[1]")).sendKeys("test mukesh");
	}
}
