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

	FileInputStream fs;
	XSSFWorkbook wb;
	@Test
	public void TestReadFIle()  {
		
		
		File src=new File("C:/Users/Mukesh_Otwani/Desktop/test.xlsx");
		
		
		try {
			
			fs = new FileInputStream(src);
			System.out.println("System File Read");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated c 
		}
		
		
		try {
			System.out.println("inside try");
			wb=new XSSFWorkbook(fs);
			
			System.out.println("Workbook Loaded");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
                XSSFSheet sheet1=  wb.getSheetAt(0);
                
                System.out.println("Sheet Loaded"+sheet1.getSheetName());
                
      Iterator<Row>   rowiterator= sheet1.iterator();
      int rownum=0,colnum=0;
      while(rowiterator.hasNext()){
    	  
    	  System.out.println("Row Iterator Started");
    	Row row=   rowiterator.next();
    	
    Iterator<Cell> cell=	row.cellIterator();
    
               while(cell.hasNext()){
            	   colnum++;
        Cell cell1=  cell.next();
        String cellvalue=cell1.getStringCellValue();
        if(cellvalue!=null){
        	colnum++;
        }
        System.out.println("Cell Iterator Started");
        System.out.println("cell value is "+cellvalue); 
        
        System.out.println("row no "+rownum+" and total columns "+colnum);
               }
               rownum++;
      }
		
	
	try{
		if(fs!=null){
			fs.close();
		}
	}catch(IOException ioe){
		System.out.print("exception "+ioe.getMessage());
	}
}}
