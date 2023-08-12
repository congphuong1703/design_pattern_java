package structural.bridge;

public class Main {

    public static void main(String[] args) {
        Bank techcombank = new Techcombank(new CheckingAccount());
        techcombank.openAccount();

        Bank vietcombank = new Vietcombank(new SavingAccount());
        vietcombank.openAccount();
    }
}
