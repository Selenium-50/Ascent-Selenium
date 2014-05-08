package MoreAnnotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParaameter {

	@Parameters({ "datasource", "jdbcDriver" })

	@Test
	public void Testpara(@Optional("Bantu")String firstname, @Optional("Mukku")String lastname){
		
		System.out.println("I m using Parameter "+firstname+"  I m using "+lastname);
		
	}
	
	@Test
	public void TestData1(){
		
		System.out.println("hi ");
	}
}
