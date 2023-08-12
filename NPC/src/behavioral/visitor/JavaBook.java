package behavioral.visitor;

public class JavaBook implements ProgrammingBook {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return "Java";
    }
}
