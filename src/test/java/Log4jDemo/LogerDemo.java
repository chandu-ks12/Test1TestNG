package Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = LogManager.getLogger("LogerDemo");
		System.out.println("this is logger demo");
		
		log.info("for info only");
		log.debug("for debug");
		log.warn("warning msg");
		log.error("error msg");
		


	}

}
