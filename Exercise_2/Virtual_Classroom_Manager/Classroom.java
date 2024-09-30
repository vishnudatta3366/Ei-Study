// Classroom.java
import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private final String name;
    private final Map<String, Student> students = new HashMap<>();
    private final Map<String, Assignment> assignments = new HashMap<>();

    public Classroom(String name) {
        this.name = name;
    }

    public void addStudent(Student student) throws Exception {
        if (students.containsKey(student.getId())) {
            throw new Exception("Student already enrolled in the classroom.");
        }
        students.put(student.getId(), student);
    }

    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    public void addAssignment(Assignment assignment) {
        assignments.put(assignment.getDetails(), assignment);
    }

    public Assignment getAssignment(String details) {
        return assignments.get(details);
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled in " + name + ".");
            return;
        }
        System.out.println("Students in " + name + ":");
        students.keySet().forEach(studentId -> System.out.println("- " + studentId));
    }
}
