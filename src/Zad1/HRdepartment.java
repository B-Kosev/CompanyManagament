package Zad1;

import java.util.ArrayList;

public class HRdepartment {
    private Manager manager;
    private ArrayList<Staff> staff;

    public HRdepartment(Manager manager) {
        setManager(manager);
        staff = new ArrayList<>();
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        if (manager != null) {
            this.manager = manager;
        } else {
            this.manager = new Manager("", 0.0, "");
        }

        this.manager.setOnAppointmentAction(this::addStaff);
    }

    public void addStaff(Staff member, Double salary) {
        member.setSalary(salary);
        member.setWorkAt(getManager().getManageDeptName());
        staff.add(member);
    }

    @Override
    public String toString() {
        return String.format("Manager: %s\n Staff:\n %s", getManager().toString(), staff.toString());
    }
}
