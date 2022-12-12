package singleton;

public class BillPugh {

    //Khi Singleton được tải vào bộ nhớ thì SingletonHelper chưa được tải vào.
    // Nó chỉ được tải khi và chỉ khi phương thức getInstance() được gọi.
    // Với cách này tránh được lỗi cơ chế khởi tạo instance của Singleton trong Multi-Thread,
    // performance cao do tách biệt được quá trình xử lý.
    // Do đó, cách làm này được đánh giá là cách triển khai Singleton nhanh và hiệu quả nhất.

    private BillPugh() {

    }

    private static BillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPugh INSTANCE = new BillPugh();
    }
}
