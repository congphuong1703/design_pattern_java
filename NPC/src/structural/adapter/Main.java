package structural.adapter;
//Client
public class Main {

    public static void main(String[] args) {
        Television television = new Television(24, "SamSung", "SamSung");
        UnitAdapter unitAdapter = new UnitAdapterImpl(television);
        System.out.println(television.toString());
        System.out.println(unitAdapter.getSize());
    }
}
