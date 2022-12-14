package bridge;

public class Techcombank extends Bank {

    public Techcombank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open your account at Techcombank is a ");
        account.openAccount();
    }
}
