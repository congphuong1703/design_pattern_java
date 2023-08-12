package behavioral.visitor;

public interface Visitor {
    void visit(BusinessBook businessBook);

    void visit(ProgrammingBook programmingBook);
}
