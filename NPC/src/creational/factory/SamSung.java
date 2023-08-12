package creational.factory;

public class SamSung extends Laptop implements LaptopInterface {

    @Override
    public String getName() {
        return "Sam Sung";
    }

    @Override
    public String getInfo() {
        return "Sam Sung: " + super.toString();
    }
}
