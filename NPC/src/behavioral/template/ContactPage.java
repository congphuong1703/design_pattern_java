package behavioral.template;

public class ContactPage extends PageTemplate {
    @Override
    protected void showBody() {
        System.out.println("Content of Contact Page");
    }

    @Override
    protected void showNavigation() {
        System.out.println("No navigation");
    }
}
