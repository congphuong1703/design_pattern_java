package decorator;

public class TeamMember extends EmployeeDecorator {

    protected TeamMember(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    public void reportTask() {
        System.out.println(this.employeeComponent.getName() + " is reporting task");
    }

    public void coordinateWithOthers() {
        System.out.println(this.employeeComponent.getName() + " is coordinating with others");
    }

    @Override
    public void doTask() {
        employeeComponent.doTask();
        reportTask();
        coordinateWithOthers();
    }

}
