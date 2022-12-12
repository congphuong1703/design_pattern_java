package builder;
//Client
public class Main {

    //Builder pattern là một trong những Creational pattern. Builder pattern là mẫu thiết kế đối tượng được
    // tạo ra để xây dựng một đôi tượng phức tạp bằng cách sử dụng các đối tượng đơn giản và sử
    // dụng tiếp cận từng bước, việc xây dựng các đối tượng đôc lập với các đối tượng khác.

    public static void main(String[] args) {
        Laptop laptop = new LaptopBuilder()
                .cpu("intel")
                .ram(16)
                .ssd(512)
                .hdd(512)
                .build();

        System.out.println(laptop.toString());
    }
}
