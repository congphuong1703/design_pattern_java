package decorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Normal Employee");
        EmployeeComponent normal = new EmployeeConcreteComponent("NPC");
        normal.showBasicInformation();
        normal.doTask();

        System.out.println("Team Leader");
        EmployeeComponent teamLeader = new EmployeeDecorator(normal);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("Manager");
        EmployeeComponent manager = new EmployeeDecorator(normal);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("Team Member");
        EmployeeComponent teamMember = new EmployeeDecorator(normal);
        teamMember.showBasicInformation();
        teamMember.doTask();

        System.out.println("Team Leader and Manager");
        EmployeeComponent teamLeaderOrManager = new Manager(teamLeader);
        teamLeaderOrManager.showBasicInformation();
        teamLeaderOrManager.doTask();
    }
}
