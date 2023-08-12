package behavioral.visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook businessBook) {
        System.out.println(businessBook.getPublisher());
    }

    @Override
    public void visit(ProgrammingBook programmingBook) {
        System.out.println(programmingBook.getResource());
    }
}
