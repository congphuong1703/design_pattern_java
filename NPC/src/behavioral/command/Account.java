package behavioral.command;

public class Account {

    private String name;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Account: " + this.name + " Open");
    }

    public void close() {
        System.out.println("Account: " + this.name + " Close");
    }
}
