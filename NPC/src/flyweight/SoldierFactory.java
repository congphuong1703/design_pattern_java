package flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SoldierFactory {

    private static final Map<String, SoldierService> soldiers = new HashMap<>();
    public static synchronized SoldierService createSoldier(String name) {
        SoldierService soldierService = soldiers.get(name);
        if (soldierService == null) {
            waitingForCreateASoldier();
            soldierService = new Soldier(name);
            soldiers.put(name, soldierService);
        }

        return soldierService;
    }

    public static synchronized int getTotalOfSoldiers() {
        return soldiers.size();
    }

    public static void waitingForCreateASoldier() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
