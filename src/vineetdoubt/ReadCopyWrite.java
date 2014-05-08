

package vineetdoubt;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class ReadCopyWrite {

	int row=0;
	int column=0;
	Workbook IpWb;
	WritableWorkbook OpResult;
	@Test
	
	public void loopxl()  {
		
		System.out.println("Before Loop"+row+"   "+column);
		// Input file declaration
		File IpSrc = new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Vineet\\TestData.xls");
		
		try {
			IpWb = Workbook.getWorkbook(IpSrc);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet Ish1 = IpWb.getSheet(0);
		
		// Output file declaration
		File OpFile = new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Vineet\\6.xls");
		
		try {
			OpResult = Workbook.createWorkbook(OpFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WritableSheet OpSh1 = OpResult.createSheet("OutPut", 0);
		
		//Loop for copying data from Input file and writing to op file
		
		for(row=0; row<IpWb.getSheet(0).getRows(); row++)
		{
			for(column=0; column<IpWb.getSheet(0).getColumns(); column++)
			{
				
				System.out.println(row+"   "+column);
				Cell Cij = Ish1.getCell(column, row);
				String Data = Cij.getContents();
				//System.out.println(Ish1.getColumns() + Ish1.getRows());
				
				Label Lij = new Label(column, row, Data);
				try {
					OpSh1.addCell(Lij);
				} catch (RowsExceededException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		try {
			OpResult.write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OpResult.close();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}