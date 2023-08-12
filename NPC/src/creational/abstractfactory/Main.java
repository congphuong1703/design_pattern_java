package creational.abstractfactory;

import creational.abstractfactory.desktop.Desktop;
import creational.abstractfactory.laptop.Laptop;

public class Main {

    //Abstract Factory pattern là một trong những Creational pattern. Nó là phương pháp tạo ra một Super-creational.factory dùng để
    // tạo ra các Factory khác. Hay còn được gọi là Factory của các Factory. Abstract Factory Pattern là một Pattern cấp
    // cao hơn so với Factory Method Pattern.

    public static void main(String[] args) {
        ComputerAbstractFactory computerFactory = ComputerFactory.getInstance(ComputerFactoryType.LAPTOP);
        Laptop laptop = (Laptop) computerFactory.getInstance("Thinkpad");
        System.out.println(laptop.getName());
        ComputerAbstractFactory computerFactory2 = ComputerFactory.getInstance(ComputerFactoryType.DESKTOP);
        Desktop desktop = (Desktop) computerFactory2.getInstance("Gaming");
        System.out.println(desktop.getRam());
    }
}
