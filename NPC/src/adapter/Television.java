package adapter;


public class Television {

    private int size;
    private String name;
    private String manufacturer;

    public Television(int size, String name, String manufacturer) {
        this.size = size;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public Television() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Television{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
