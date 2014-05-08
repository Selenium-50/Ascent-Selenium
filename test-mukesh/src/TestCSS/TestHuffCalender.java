package TestCSS;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestHuffCalender {

	@Test
	public void TestHuff11(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://hullmansford.qa.dealerconnection.com/test-drive/Ford/2013-F-150?requestType=test-drive");
	/*	driver.findElement(By.xpath(".//*[@id='first_pref_date']")).sendKeys("03/10/2014");
		new Actions(driver).sendKeys(Keys.ENTER).build().perform();*/
		driver.findElement(By.cssSelector("i.icon-calendar")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/thead/tr/th[3]/i")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[3]/table/tbody/tr[3]/td[2]")).click();
}

}