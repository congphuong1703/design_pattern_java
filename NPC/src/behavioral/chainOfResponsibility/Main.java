package behavioral.chainOfResponsibility;


//Client
public class Main {

    public static void main(String[] args) {

        Logger logger = AppLogger.getLogger();

        // Handled by ConsoleLogger since the console has a LogLevel of DEBUG
        logger.log(LogLevel.INFO, "Info message");
        logger.log(LogLevel.DEBUG, "Debug message");

        // Handled by ConsoleLogger and FileLogger
        logger.log(LogLevel.ERROR, "Error message");

        // Handled by ConsoleLogger, FileLogger, EmailLogger
        logger.log(LogLevel.FATAL, "Factal message");
    }
}
