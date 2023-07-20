package comutil;

import org.apache.logging.log4j.*;
public class Loggerdemo {

	public static void main(String[] args) {
	 Logger log =LogManager.getLogger("Loggerdemo");
	 System.out.println("hello world");
	 log.info("info message");
	 log.error("errror message");
	 log.debug("debug message");
	 log.warn("warn message");
	 log.trace("trace message");
	
	}

}
