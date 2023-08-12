package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent {

    private List<FileComponent> files = new ArrayList<>();

    public FolderComposite(List<FileComponent> files) {
        this.files = files;
    }

    public FolderComposite() {
    }

    public List<FileComponent> getFiles() {
        return files;
    }

    public void setFiles(List<FileComponent> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        this.files.forEach(e -> e.showProperty());
    }

    @Override
    public long totalSize() {
        long totalSize = 0;
        for (FileComponent file : this.files) {
            totalSize += file.totalSize();
        }

        return totalSize;
    }
}
