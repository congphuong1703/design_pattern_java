package behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        Book businessBook = new BusinessBook();
        Book javaBook = new JavaBook();
        Book phpBook = new PHPBook();

        Visitor visitor = new VisitorImpl();
        businessBook.accept(visitor);
        javaBook.accept(visitor);
        phpBook.accept(visitor);
    }
}
