package Zad1;

public class AppointTest {

    public static void main(String[] args) {
        Manager boss = new Manager("Ivailo Panayotov", 4250.0, "Invoices");

        Staff[] candidates = new Staff[2];
        candidates[0] = new Staff("Petar Karchev", 760.0, "Candidate");
        candidates[1] = new Staff("Ivan Todorov", 1100.0, "Candidate");

        System.out.println("Manager:");
        System.out.println(boss.toString());

        System.out.println();
        System.out.println("Candidate 1:");
        System.out.println(candidates[0].toString());
        System.out.println("Candidate 2:");
        System.out.println(candidates[1].toString());

        HRdepartment hRdepartment = new HRdepartment(boss);

        boss.onStaffAppointment(candidates[0], 1300.0);
        boss.onStaffAppointment(candidates[1], 1500.0);

        System.out.println("\nAfter appointment:");
        System.out.println("Manager:");
        System.out.println(boss.toString());

        System.out.println();
        System.out.println("Staff member 1:");
        System.out.println(candidates[0].toString());
        System.out.println("Staff member 2:");
        System.out.println(candidates[1].toString());
    }
}
