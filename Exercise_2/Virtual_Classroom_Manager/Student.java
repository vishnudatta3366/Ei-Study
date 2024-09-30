// Student.java
public class Student {
    private final String id;

    public Student(String id) {
        if (id.isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty.");
        }
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
