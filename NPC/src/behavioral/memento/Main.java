package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Memento> mementos = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("1");
        originator.setState("2");

        mementos.add(originator.saveToMemento());
        originator.setState("3");
        mementos.add(originator.saveToMemento());
        originator.setState("4");

        originator.restoreFromMemento(mementos.get(1));
    }
}
