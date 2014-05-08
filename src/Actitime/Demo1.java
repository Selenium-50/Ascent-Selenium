package Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

	WebDriver driver;
	@BeforeTest
	    public void SetUpBrowser(){
		    driver=new FirefoxDriver();
			driver.get("http://localhost:1965/login.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void AddUser(){
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("Login Successful");
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[9]/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='ext-gen7']")).click();
		driver.findElement(By.xpath(".//*[@id='userDataLightBox_firstNameField']")).sendKeys("Test User 1");
		driver.findElement(By.xpath(".//*[@id='userDataLightBox_lastNameField']")).sendKeys("Selenium Testing");
		driver.findElement(By.xpath(".//*[@id='userDataLightBox_emailField']")).sendKeys("testselenium@gmail.com");
		driver.findElement(By.xpath(".//*[@id='userDataLightBox_usernameField']")).sendKeys("Selenum_123");
		driver.findElement(By.xpath(".//*[@id='userDataLightBox_passwordField']")).sendKeys("Password1");
		driver.findElement(By.xpath(".//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("Password1");
		driver.findElement(By.cssSelector("DIV#userDataLightBox_commitBtn.controlButton")).click();
	}
	
	
	
	@AfterTest
	public void QuitBrowser(){
		driver.quit();
	}
}
