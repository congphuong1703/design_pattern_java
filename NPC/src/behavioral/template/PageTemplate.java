package behavioral.template;

public abstract class PageTemplate {

    protected void showHeader() {
        System.out.println("Header");
    }

    protected void showNavigation() {
        System.out.println("Navigation");
    }

    protected void showFooter() {
        System.out.println("Footer");
    }

    protected abstract void showBody();

    public final void showPage() {
        this.showHeader();
        this.showNavigation();
        this.showBody();
        this.showFooter();
    }
}
