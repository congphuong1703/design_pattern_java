package decorator;

import java.util.Date;

public class EmployeeDecorator implements EmployeeComponent {

    protected EmployeeComponent employeeComponent;

    protected EmployeeDecorator(EmployeeComponent employeeComponent) {
        this.employeeComponent = employeeComponent;
    }

    @Override
    public String getName() {
        return employeeComponent.getName();
    }

    @Override
    public void doTask() {
        employeeComponent.doTask();
    }

    @Override
    public void join(Date date) {
        employeeComponent.join(date);
    }

    @Override
    public void terminate(Date terminateDate) {
        employeeComponent.terminate(terminateDate);
    }
}
