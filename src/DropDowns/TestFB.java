package DropDowns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFB {

	
	@Test
	public void TestDD(){
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	Select sel=	new Select(driver.findElement(By.id("month")));
	sel.selectByIndex(1);
		
	WebElement ele1=sel.getFirstSelectedOption();
	System.out.println(ele1.getText());
	
	List<WebElement> li1=sel.getOptions();
	
	List<String> act=new ArrayList<String>();
	
	
	
	Iterator<WebElement>  i1=li1.iterator();
	while(i1.hasNext()){
		act.add(i1.next().getText());
		System.out.println(i1.next().getText());
	}
	
	List<String> exp=new ArrayList<String>();
	exp.add("Jan");
	exp.add("Feb");
	exp.add("Mar");
	
	try {
		Assert.assertEquals(act, exp);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Assert.assertEquals(exp.size(), act.size());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	

}
