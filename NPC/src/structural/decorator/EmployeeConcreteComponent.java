package structural.decorator;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent {

    public EmployeeConcreteComponent(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doTask() {
        System.out.println("Do task");
    }

    @Override
    public void join(Date date) {
        System.out.println(this.getName() + " joined on " + formatDate(date));
    }

    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));
    }
}
