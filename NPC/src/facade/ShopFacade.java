package facade;

public class ShopFacade {

    private final static ShopFacade INSTANCE = new ShopFacade();

    private AccountService accountService;
    private EmailService emailService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public ShopFacade() {
        this.accountService = new AccountService();
        this.emailService = new EmailService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public static ShopFacade getInstance() {
        return INSTANCE;
    }

    public void buyProductByCashWithFreeShipping(String email){
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        emailService.sendMail(email);
    }

    public void buyProductByCreditCardStandardShipping(String email){
        accountService.getAccount(email);
        paymentService.paymentByCreditCard();
        shippingService.standardShipping();
        emailService.sendMail(email);
    }
}
