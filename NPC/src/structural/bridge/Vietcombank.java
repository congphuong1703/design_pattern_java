package structural.bridge;

public class Vietcombank extends Bank {

    public Vietcombank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open your account at Vietcombank is a ");
        account.openAccount();
    }
}
