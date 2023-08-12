package creational.abstractfactory;

import creational.abstractfactory.desktop.DesktopFactory;
import creational.abstractfactory.laptop.LaptopFactory;

public class ComputerFactory {

    public ComputerFactory() {

    }

    public static final ComputerAbstractFactory getInstance(ComputerFactoryType type) {
        switch (type) {
            case DESKTOP:
                return new DesktopFactory();
            case LAPTOP:
                return new LaptopFactory();
            default:
                throw new IllegalArgumentException("This Desktop is unsupported");
        }
    }
}
