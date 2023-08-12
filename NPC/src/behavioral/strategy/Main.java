package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        List<String> items = new ArrayList<>();
        items.add("NPC 1");
        items.add("NPC 2");
        items.add("NPC 4");
        items.add("NPC 3");
        items.add("NPC 5");

        sortedList.setItems(items);
        sortedList.setStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setStrategy(new SelectionSort());
        sortedList.sort();
    }
}
