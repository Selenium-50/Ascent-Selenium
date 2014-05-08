package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class TestXML {

	public static void main(String[] args) throws InvalidPropertiesFormatException, Exception {
		
		
		Properties p=new Properties();
		FileInputStream fs=new FileInputStream(new File("C:\\Users\\Mukesh_Otwani\\Desktop\\login.xml"));
		p.loadFromXML(fs);
		//String a=p.get("first").toString();
		System.out.println(p.getProperty("firstname"));
		//System.out.println(a);
		
	}

}
