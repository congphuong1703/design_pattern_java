package composite;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileComponent fileComponent = new FileLeaf("1", 10);
        FileComponent fileComponent1 = new FileLeaf("2", 20);
        FileComponent fileComponent2 = new FileLeaf("3", 30);
        FileComponent fileComponent3 = new FileLeaf("4", 40);

        List<FileComponent> fileComponentList = Arrays.asList(fileComponent, fileComponent1, fileComponent2,
                fileComponent3);

        FileComponent folderComposite = new FolderComposite(fileComponentList);

        folderComposite.showProperty();
        System.out.println("total size: " + folderComposite.totalSize());
    }
}
