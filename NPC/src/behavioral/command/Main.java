package behavioral.command;

public class Main {


    public static void main(String[] args) {
        Account account = new Account("NPC");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);

        BankApp bankApp = new BankApp(open, close);

        bankApp.onClickOpenAccount();
        bankApp.onClickCloseAccount();
    }
}
