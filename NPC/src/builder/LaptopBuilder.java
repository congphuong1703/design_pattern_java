package builder;
//Builder
public class LaptopBuilder {

    private int ram;
    private String cpu;
    private int hdd;
    private int ssd;

    public LaptopBuilder ram(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public LaptopBuilder hdd(int hdd) {
        this.hdd = hdd;
        return this;
    }

    public LaptopBuilder ssd(int ssd) {
        this.ssd = ssd;
        return this;
    }

    public Laptop build() {
        return new Laptop(ram, cpu, hdd, ssd);
    }

}
