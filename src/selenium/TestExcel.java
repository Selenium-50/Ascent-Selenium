package selenium;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestExcel {

	@Test
	public void ReadData() throws BiffException, IOException{
		
		
	Workbook wb=	Workbook.getWorkbook(new File("C:\\Users\\Mukesh_Otwani\\Desktop\\SeleniumData.xlsx"));
	System.out.println(wb.getSheet(0).getCell(0,0).getContents());
	}
}
