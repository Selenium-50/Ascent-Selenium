package LoggingReport;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogMukeshTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Logger logs=	Logger.getLogger("TestLogMukeshTrace");
PropertyConfigurator.configure("Log4j.properties");
logs.debug("this is demo Logger");
logs.debug("this is demo Logger 1");
logs.debug("this is demo Logger 2");
logs.debug("this is demo Logger 3");
logs.debug("this is demo Logger 4");


	}

}
