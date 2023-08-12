package behavioral.visitor;

public class PHPBook implements ProgrammingBook {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return "PHP";
    }
}
