package behavioral.visitor;

public class BusinessBook implements Book {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPublisher() {
        return "Publisher";
    }
}
