package creational.factory;

public class ThinkPad extends Laptop implements LaptopInterface {

    public ThinkPad(int ram, String cpu, int hdd, int ssd) {
        super(ram, cpu, hdd, ssd);
    }

    public ThinkPad() {
    }

    @Override
    public String getName() {
        return "Think Pad";
    }

    @Override
    public String getInfo() {
        return "Think Pad: " + super.toString();
    }

}
