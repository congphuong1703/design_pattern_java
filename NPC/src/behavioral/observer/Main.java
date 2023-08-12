package behavioral.observer;

public class Main {

    public static void main(String[] args) {
        AccountService accountService = new AccountService("congphuong@gmail.com", "NPC 1");
        accountService.attach(new Logger());
        accountService.attach(new Mailer());

        accountService.login();
        accountService.changeStatus(LoginStatus.EXPIRED);

        System.out.println("--------- ----------");

        AccountService accountService1 = new AccountService("congphuong@gmail1.com", "NP 1");
        accountService1.attach(new Logger());
        accountService1.attach(new Mailer());
        accountService1.login();
    }
}
