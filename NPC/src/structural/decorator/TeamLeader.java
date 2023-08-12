package structural.decorator;

public class TeamLeader extends EmployeeDecorator {


    protected TeamLeader(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    public void planning() {
        System.out.println(this.employeeComponent.getName() + " is planning");
    }

    public void motivate() {
        System.out.println(this.employeeComponent.getName() + " is motivating");
    }

    public void monitor() {
        System.out.println(this.employeeComponent.getName() + " is monitoring");
    }

    @Override
    public void doTask(){
        employeeComponent.doTask();
        planning();
        motivate();
        monitor();
    }

}
