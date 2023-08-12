package behavioral.observer;

public class Mailer implements Observer {
    @Override
    public void update(User user) {
        if (user.getLoginStatus().equals(LoginStatus.EXPIRED)) {
            System.out.println("Mailed: User " + user.getEmail());
        }
    }
}
