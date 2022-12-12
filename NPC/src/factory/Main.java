package factory;

//client
public class Main {

    //Factory Pattern đúng nghĩa là một nhà máy, và nhà máy này sẽ “sản xuất” các đối tượng theo yêu cầu của chúng ta.
    //https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java
    public static void main(String[] args) {
        LaptopInterface laptop = LaptopFactory.getLaptop(LaptopType.THINK_PAD);
        System.out.println(laptop.getName());
        System.out.println(laptop.getInfo());

        LaptopInterface thinkpad = LaptopFactory.getThinkPad(16, "Intel", 512, 512);
        System.out.println(thinkpad.toString());
        System.out.println(thinkpad.getInfo());
    }
}
