package structural.facade;

public class Main {

    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("freeshipping@email.com");
        ShopFacade.getInstance().buyProductByCreditCardStandardShipping("standardshipping@email.com");

    }
}
