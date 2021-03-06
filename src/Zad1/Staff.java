package Zad1;

public class Staff extends Employee {
    private String workAt;

    public Staff(String name, double salary, String workAt) {
        super(name, salary);
        setWorkAt(workAt);
    }

    public String getWorkAt() {
        return workAt;
    }

    public void setWorkAt(String workAt) {
        if (workAt != null) {
            this.workAt = workAt;
        } else {
            this.workAt = "Unknown";
        }
    }

    @Override
    public String toString() {
        return String.format("%s, Works at: %s", super.toString(), getWorkAt());
    }
}
