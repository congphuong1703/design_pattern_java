package decorator;

public class Manager extends EmployeeDecorator {


    protected Manager(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }


    public void createRequirement(){
        System.out.println(this.employeeComponent.getName() + " is created requirement");
    }

    public void assignTask(){
        System.out.println(this.employeeComponent.getName() + " is assigning task");
    }

    public void manageProgress(){
        System.out.println(this.employeeComponent.getName() + " is managing task");
    }

    @Override
    public void doTask(){
        employeeComponent.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
