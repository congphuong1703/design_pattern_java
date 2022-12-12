package factory;

public class Microsoft extends Laptop implements LaptopInterface {

    public Microsoft(int ram, String cpu, int hdd, int ssd) {
        super(ram, cpu, hdd, ssd);
    }

    public Microsoft() {
    }

    @Override
    public String getName() {
        return "Microsoft";
    }

    @Override
    public String getInfo() {
        return "Microsoft: " + super.toString();
    }
}
