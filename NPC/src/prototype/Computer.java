package prototype;

public class Computer implements Cloneable {

    private int ram;
    private String cpu;
    private int ssd;
    private int hdd;

    public Computer(int ram, String cpu, int ssd, int hdd) {
        super();
        this.ram = ram;
        this.cpu = cpu;
        this.ssd = ssd;
        this.hdd = hdd;
    }


    public Computer() {
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

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", ssd=" + ssd +
                ", hdd=" + hdd +
                '}';
    }
}
