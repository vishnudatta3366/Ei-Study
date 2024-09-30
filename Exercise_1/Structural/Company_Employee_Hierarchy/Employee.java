package Exercise_1.Structural.Company_Employee_Hierarchy;

import java.util.List;

public abstract class Employee {
    protected String name;
    protected String position;

    public Employee(String name, String position) {
        if (name == null || position == null) {
            throw new IllegalArgumentException("Name and position cannot be null");
        }
        this.name = name;
        this.position = position;
    }

    public abstract void add(Employee employee);
    public abstract void remove(Employee employee);
    public abstract List<Employee> getSubordinates();
    public abstract void displayDetails();
}
