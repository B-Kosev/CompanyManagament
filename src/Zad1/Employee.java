package Zad1;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public Employee() {
        this("", 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Salary: %.2f", getName(), getSalary());
    }
}
