package behavioral.state;

public class RejectState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Rejected");
    }
}
