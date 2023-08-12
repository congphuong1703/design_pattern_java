package behavioral.template;

public class Main {

    public static void main(String[] args) {
        PageTemplate homePage = new HomePage();
        homePage.showPage();

        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();

        PageTemplate contactPage = new ContactPage();
        contactPage.showPage();
    }
}

