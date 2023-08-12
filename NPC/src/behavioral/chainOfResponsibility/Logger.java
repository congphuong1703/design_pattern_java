package behavioral.chainOfResponsibility;


//handler cho phép thực hiện một chain logger dựa vào giá trị LogLevel ứng với từng Handler
public abstract class Logger {

    protected LogLevel logLevel;
    protected Logger nextLogger;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public Logger getNextLogger() {
        return nextLogger;
    }

    public Logger setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    protected abstract void writeMessage(String msg);

    public void log(LogLevel severity, String msg) {
        if (logLevel.getLevel() <= severity.getLevel()) {
            writeMessage(msg);
        }
        if (nextLogger != null) {
            nextLogger.log(severity, msg);
        }
    }
}
