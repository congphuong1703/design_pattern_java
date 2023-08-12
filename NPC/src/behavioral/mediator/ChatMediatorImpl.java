package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    public ChatMediatorImpl(String groupName) {
        System.out.println(groupName + " group already created");
    }

    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User user) {
        this.users.forEach(e -> {
            if (!e.equals(user)) {
                e.receive(msg);
            }
        });
    }

    @Override
    public void addUser(User user) {
        System.out.println(user.name + " joined this group");
        this.users.add(user);
    }
}
