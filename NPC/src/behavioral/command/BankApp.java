package behavioral.command;

public class BankApp {

    private Command openAccount;
    private Command closeAccount;

    public BankApp(Command openAccount, Command closeAccount) {
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
    }

    public void onClickOpenAccount() {
        System.out.println("User click open account");
        openAccount.execute();
    }

    public void onClickCloseAccount() {
        System.out.println("User click close account");
        closeAccount.execute();
    }
}
