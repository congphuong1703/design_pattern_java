package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {

    private SortStrategy strategy;
    private List<String> items = new ArrayList<>();


    public SortStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void sort() {
        strategy.sort(items);
    }
}
