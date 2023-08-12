package structural.flyweight;

public class Soldier implements SoldierService {

    private final String name;

    public Soldier(String name) {
        this.name = name;
        System.out.println("Soldier is created! " + this.name);
    }

    @Override
    public void promote(Context context) {
        System.out.println(this.name + " " + context.getId() + " promoted " + context.getStar());
    }
}
