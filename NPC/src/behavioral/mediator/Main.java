package behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl("NPC group");

        User admin = new UserImpl(mediator, "NPC 1 ");
        User admin1 = new UserImpl(mediator, "NPC 2 ");
        User admin2 = new UserImpl(mediator, "NPC 3 ");
        User user = new UserImpl(mediator, "Anonymous");

        mediator.addUser(user);
        mediator.addUser(admin1);
        mediator.addUser(admin1);
        mediator.addUser(admin2);

        user.send("Hi");
        admin.send("Hello");
    }
}
