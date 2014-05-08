package JavaPrograms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateProgram {

	public static void main(String[] args) throws IOException {
		   
		
SimpleDateFormat dateformat=		new SimpleDateFormat("yyyy/MMM/ddhh:mm:ss");

Date d=new Date();

System.out.println(dateformat.format(d));

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

driver.get("http://www.google.com");

File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(src, new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Mukesh@DeLL\\Selenium Traning\\feb7\\DemoProject\\"+dateformat.format(d)+".png"));
		

	}

}
