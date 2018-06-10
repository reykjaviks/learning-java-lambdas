package chapter4.sandbox;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Elizabeth Berg
 */
public class LambdaLogger {

    final static Logger logger = Logger.getLogger(LambdaLogger.class);

    // Traditional way of optimizing logger
    public void changeName(String name) {
        BasicConfigurator.configure();
        if (logger.isDebugEnabled()) { // Not needed if message does not involve concatenating
            logger.debug("Save successful, new name: " + name);
        }
    }
    
    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.debug("This is debug ");
        logger.info("Entering the Execute method");
        logger.error("Error while saving");
    }
}
