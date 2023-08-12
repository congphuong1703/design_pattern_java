package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject {

    private User user;
    private List<Observer> observers = new ArrayList<>();

    public AccountService(String email, String username) {
        user = new User(email, username);
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        this.observers.forEach(e -> {
            e.update(user);
        });
    }

    public void changeStatus(LoginStatus status) {
        user.setLoginStatus(status);
        System.out.println("Status is changed");
        this.notifyAllObserver();
    }

    public void login() {
        if (!this.isValidUsername()) {
            user.setLoginStatus(LoginStatus.INVALID);
        } else if (isValidEmail()) {
            user.setLoginStatus(LoginStatus.SUCCESS);
        } else {
            user.setLoginStatus(LoginStatus.FAILURE);
        }

        System.out.println("Login is handled");
        this.notifyAllObserver();
    }

    private boolean isValidUsername() {
        return user.getUsername().contains("NPC");
    }

    private boolean isValidEmail() {
        return user.getEmail().contains("@gmail.com");
    }
}
