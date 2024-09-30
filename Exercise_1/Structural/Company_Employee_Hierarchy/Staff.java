package Exercise_1.Structural.Company_Employee_Hierarchy;

import java.util.Collections;
import java.util.List;

public class Staff extends Employee {
    public Staff(String name, String position) {
        super(name, position);
    }

    @Override
    public void add(Employee employee) {
        // Not applicable
    }

    @Override
    public void remove(Employee employee) {
        // Not applicable
    }

    @Override
    public List<Employee> getSubordinates() {
        return Collections.emptyList();
    }

    @Override
    public void displayDetails() {
        System.out.println("  " + position + ": " + name);
    }
}
