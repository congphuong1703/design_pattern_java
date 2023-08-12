package creational.singleton;

public class EagerInitialization {

    //với cách này thì nếu class này chưa được hoặc không sử dụng thì object cũng đã được khởi tạo nên có thể gây lãng phí memory.
    private static EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {
        return instance;
    }

}
