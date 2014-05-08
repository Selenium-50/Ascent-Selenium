package TestPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestPOIREAD {

	FileInputStream fs=null;
	XSSFWorkbook wb=null;
	@Test
	public void TestReadFIle()  {
		
		
		File src=new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Vineet\\testdata1.xlsx");
		
		
		try {
			
			fs = new FileInputStream(src);
			System.out.println("System File Read");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			wb = new XSSFWorkbook(fs);
			System.out.println("Workbook Loaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
                XSSFSheet sheet1=  wb.getSheetAt(0);
                
      Iterator<Row>   rowiterator= sheet1.iterator();
      
      while(rowiterator.hasNext()){
    	  
    	  System.out.println("Row Iterator Started");
    	Row row=   rowiterator.next();
    	
    Iterator<Cell> cell=	row.cellIterator();
    
               while(cell.hasNext()){
            	   
        Cell cell1=  cell.next();
        System.out.println("Cell Iterator Started");
        System.out.println(cell1.getStringCellValue());
               }
      }
		
	}
}
