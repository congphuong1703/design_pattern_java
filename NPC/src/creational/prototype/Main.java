package creational.prototype;

public class Main {

//Prototype pattern là một trong những Creational pattern. Nó có nhiệm vụ khởi tạo một đối tượng bằng cách clone một
// đối tượng đã tồn tại thay vì khởi tạo với từ khoá new. Đối tượng mới là một bản sao có thể giống 100% với đối
// tượng gốc, chúng ta có thể thay đổi dữ liệu của nó mà không ảnh hưởng đến đối tượng gốc.

    public static void main(String[] args) {
        Computer computer = new Computer(16, "Intel", 512, 512);
        try {
            Computer computerClone = (Computer) computer.clone();

            System.out.println(computerClone.toString());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(computer.toString());
    }
}
