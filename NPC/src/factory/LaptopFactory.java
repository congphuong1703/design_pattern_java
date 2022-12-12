package factory;

//factory
public class LaptopFactory {

    public LaptopFactory() {
    }

    public static final LaptopInterface getLaptop(LaptopType type) {
        switch (type) {
            case THINK_PAD:
                return new ThinkPad();
            case MICROSOFT:
                return new Microsoft();
            case SAMSUNG:
                return new SamSung();
            case APPLE:
                return new Apple();
            default:
                throw new IllegalArgumentException("This laptop is unsupported");
        }
    }

    //or

    public static final LaptopInterface getMicrosoft() {
        return new Microsoft();
    }

    public static final LaptopInterface getSamsung() {
        return new SamSung();
    }

    public static final LaptopInterface getThinkPad(int ram, String cpu, int ssd, int hdd) {
        return new ThinkPad(ram, cpu, hdd, ssd);
    }

    public static final LaptopInterface getApple() {
        return new Apple();
    }
}
