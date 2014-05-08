package TestPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestReadWrite {
	
	
	
	@org.testng.annotations.Test
	public void Test() throws Exception{
		
		FileInputStream fs=new FileInputStream(new File("./test.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(fs);
	System.out.println(wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue());
	System.out.println(wb.getSheetAt(0).getRow(0).getCell(1).getStringCellValue());
	System.out.println(wb.getSheetAt(0).getRow(1).getCell(0).getStringCellValue());
	System.out.println(wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue());
	wb.getSheetAt(0).createRow(2).createCell(0).setCellValue("pass");
	wb.getSheetAt(0).getRow(2).createCell(1).setCellValue("fail");
	wb.write(new FileOutputStream(new File("./testoutput.xlsx")));
    
	
	}

}
