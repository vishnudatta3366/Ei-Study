package Exercise_1.Structural.Company_Employee_Hierarchy;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        super(name, position);
    }

    @Override
    public void add(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        subordinates.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void displayDetails() {
        System.out.println(position + ": " + name);
        for (Employee e : subordinates) {
            e.displayDetails();
        }
    }
}

