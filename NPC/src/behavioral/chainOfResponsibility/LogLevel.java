package behavioral.chainOfResponsibility;


//Xác định mức độ ghi log
public enum LogLevel {
    NONE(0), INFO(1), DEBUG(2), WARNING(3), ERROR(4), FATAL(5);
    private int level;

    LogLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
