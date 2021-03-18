package Zad1;

import java.util.function.BiConsumer;

public class Manager extends Employee {
    private String manageDeptName;
    private BiConsumer<Staff, Double> appointmentAction;

    public Manager(String name, double salary, String manageDeptName) {
        super(name, salary);
        setManageDeptName(manageDeptName);
    }

    public Manager() {
        this("", 0.0, "");
    }

    public String getManageDeptName() {
        return manageDeptName;
    }

    public void setManageDeptName(String manageDeptName) {
        if (manageDeptName != null) {
            this.manageDeptName = manageDeptName;
        } else {
            this.manageDeptName = "Unknown";
        }
    }

    public void setOnAppointmentAction(BiConsumer<Staff, Double> appointmentAction) {
        this.appointmentAction = appointmentAction;
    }

    public void onStaffAppointment(Staff member, Double memberSalary) {
        appointmentAction.accept(member, memberSalary);
    }

    @Override
    public String toString() {
        return String.format("%s, Manages: %s", super.toString(), getManageDeptName());
    }
}
