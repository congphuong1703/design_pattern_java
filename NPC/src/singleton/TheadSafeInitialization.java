package singleton;

public class TheadSafeInitialization {
    private static TheadSafeInitialization instance;

    private TheadSafeInitialization() {

    }

    public static TheadSafeInitialization getInstance() {
        if (null == instance) {
            synchronized (TheadSafeInitialization.class) {
                if (null == instance) {
                    instance = new TheadSafeInitialization();
                }
            }
        }
        return instance;
    }
}
