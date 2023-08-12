package creational.factory;

//subclass
public class Apple extends Laptop implements LaptopInterface {
    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    public String getInfo() {
        return "Apple: " + super.toString();
    }
}
