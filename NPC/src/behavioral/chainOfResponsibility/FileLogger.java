package behavioral.chainOfResponsibility;

//ConcreteHandler. Xác định LogLevel để xử lý
public class FileLogger extends Logger {

    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("File logger: " + msg);
    }
}
