package creational.abstractfactory.laptop;


import creational.abstractfactory.ComputerAbstractFactory;

public class LaptopFactory implements ComputerAbstractFactory<Laptop> {

    private static final String THINK_PAD = "Thinkpad";
    private static final String MICROSOFT = "Microsoft";
    private static final String SAMSUNG = "Samsung";
    private static final String APPLE = "Apple";

    public LaptopFactory() {
    }

    @Override
    public Laptop getInstance(String type) {
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
}
