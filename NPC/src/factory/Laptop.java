package factory;

public class Laptop {

    private int ram;
    private String cpu;
    private int hdd;
    private int ssd;

    public Laptop(int ram, String cpu, int hdd, int ssd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ssd = ssd;
    }

    public Laptop() {
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ssd=" + ssd +
                '}';
    }
}
