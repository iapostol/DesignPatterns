package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.logger.AbstractLogger;
import behavioral.chainofresponsibility.logger.ConsoleLogger;
import behavioral.chainofresponsibility.logger.ErrorLogger;
import behavioral.chainofresponsibility.logger.FileLogger;
import org.junit.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void test() {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

}
