package structural.decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent {

    String getName();

    void doTask();

    void join(Date date);

    void terminate(Date terminateDate);

    default String formatDate(Date theDate) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(theDate);
    }

    default void showBasicInformation() {
        System.out.println("-------------------");
        System.out.println("The basic information of : " + getName());
        join(Calendar.getInstance().getTime());
        Calendar terminateDate = Calendar.getInstance();
        terminateDate.add(Calendar.MONDAY, 6);
        terminate(terminateDate.getTime());
    }
}
