// Assignment.java
import java.util.HashSet;
import java.util.Set;

public class Assignment {
    private final String details;
    private final Set<String> submissions = new HashSet<>();

    public Assignment(String details) {
        if (details.isEmpty()) {
            throw new IllegalArgumentException("Assignment details cannot be empty.");
        }
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void submitBy(Student student) throws Exception {
        if (submissions.contains(student.getId())) {
            throw new Exception("Student has already submitted this assignment.");
        }
        submissions.add(student.getId());
    }
}
