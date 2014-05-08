package selenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestCSV {
static String record;
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader BR=new BufferedReader(new FileReader("C:\\Users\\Mukesh_Otwani\\Desktop\\TestData.csv"));
        
		ArrayList<String[]> AL=new ArrayList<String[]>();
	  while((record=BR.readLine())!=null){
	String fields[]=	 record.split(",") ;
	int i=0,l=fields.length;
	System.out.println("length "+fields.length);
	for(i=0;i<l;i++){
		
		System.out.print(fields[i]);
		
	}
	
	  }
	  BR.close();
	  

	
	
	}

}
