package structural.proxy;

public class Main {

    //Cãi thiện Performance thông qua lazy loading, chỉ tải các tài nguyên khi chúng được yêu cầu.
    //Nó cung cấp sự bảo vệ cho đối tượng thực từ thế giới bên ngoài.
    //Giảm chi phí khi có nhiều truy cập vào đối tượng có chi phí khởi tạo ban đầu lớn.
    //Dễ nâng cấp, bảo trì.

    public static void main(String[] args) {
        System.out.println("Init structural.proxy");
        ProxyImage proxyImage = new ProxyImage("https://google.com");
        System.out.println("Call structural.proxy 1st");
        proxyImage.showImage();
        System.out.println("Call structural.proxy 2nd");
        proxyImage.showImage();
    }
}
