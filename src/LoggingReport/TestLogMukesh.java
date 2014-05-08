package LoggingReport;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogMukesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Logger logs=	Logger.getLogger("TestLogMukesh");
PropertyConfigurator.configure("Log4j.properties");
logs.debug("Hello");
logs.debug("we are done");
logs.debug("Done");

	}

}
