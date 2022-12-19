package composite;

public class FileLeaf implements FileComponent {

    private String name;
    private long size;

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public FileLeaf() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println("FileLeaf{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}');
    }

    @Override
    public long totalSize() {
        return this.size;
    }
}
