package structural.flyweight;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Giảm số lượng đối tượng được tạo ra bằng cách chia sẻ đối tượng. Vì vậy, tiết kiệm bộ nhớ và các thiết bị lưu
    // trữ cần thiết.
    //Cãi thiện khả năng cache dữ liệu vì thời gian đáp ứng nhanh.
    //Tăng performance.

    private static List<SoldierService> soldiers = new ArrayList<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        createSoldier(5, "Yuri", 1);
        createSoldier(5, "Spy", 1);
        createSoldier(3, "Spy", 3);
        createSoldier(2, "Yuri", 2);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
    }

    private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
        for (int i = 0; i < numberOfSoldier; i++) {
            Context context = new Context("Soldier " + (soldiers.size() + 1), numberOfStar);
            SoldierService soldier = SoldierFactory.createSoldier(soldierName);
            soldier.promote(context);
            soldiers.add(soldier);
        }
    }
}
