package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;


//import org.apache.poi.ss.usermodel.
import org.junit.Test;



public class CopyOfTestExcel {

	@Test
	public void ReadData() throws IOException{
		
		File f=new File("C:\\Users\\Mukesh_Otwani\\Desktop\\SeleniumData.xlsx");
		FileInputStream fs=new FileInputStream(f);
		HSSFWorkbook WB=new HSSFWorkbook(fs);
	    HSSFSheet sh1=	WB.getSheetAt(0);
	
	
}
}
