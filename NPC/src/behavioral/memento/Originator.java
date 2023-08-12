package behavioral.memento;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("Setting state: " + this.state);
    }

    public Memento saveToMemento() {
        System.out.println("Originator: saving to memento");
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        System.out.println("Originator: State after restore from memento " + memento.getState());
    }
}
