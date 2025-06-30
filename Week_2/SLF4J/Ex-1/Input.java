package SLF4J_package;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Message {
	 private static final Logger logger = LoggerFactory.getLogger(Message.class);

	    public static void main(String[] args) {
	        logger.error("This is an error message");
	        logger.warn("This is a warning message");
	    }
}
