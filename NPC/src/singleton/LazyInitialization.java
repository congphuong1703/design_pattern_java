package singleton;

public class LazyInitialization {

    //Ở cách thực hiện này thì object sẽ đươc tạo ra khi getInstance() method được thực hiện lần đầu tiên.
    private static LazyInitialization instance;

    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }

}
