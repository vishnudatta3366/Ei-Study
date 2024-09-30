// ClassroomManager.java
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ClassroomManager {
    private static final Logger LOGGER = Logger.getLogger(ClassroomManager.class.getName());
    private static ClassroomManager instance;
    private final Map<String, Classroom> classrooms = new HashMap<>();

    private ClassroomManager() {}

    public static synchronized ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void addClassroom(String className) throws Exception {
        if (className.isEmpty()) {
            throw new IllegalArgumentException("Class name cannot be empty.");
        }
        if (classrooms.containsKey(className)) {
            throw new Exception("Classroom already exists.");
        }
        classrooms.put(className, new Classroom(className));
        LOGGER.info("Classroom " + className + " has been created.");
        System.out.println("Classroom " + className + " has been created.");
    }

    public void addStudent(String studentId, String className) throws Exception {
        Classroom classroom = getClassroom(className);
        Student student = new Student(studentId);
        classroom.addStudent(student);
        LOGGER.info("Student " + studentId + " has been enrolled in " + className + ".");
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void scheduleAssignment(String className, String assignmentDetails) throws Exception {
        Classroom classroom = getClassroom(className);
        Assignment assignment = new Assignment(assignmentDetails);
        classroom.addAssignment(assignment);
        LOGGER.info("Assignment for " + className + " has been scheduled.");
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) throws Exception {
        Classroom classroom = getClassroom(className);
        Student student = classroom.getStudent(studentId);
        if (student == null) {
            throw new Exception("Student not found in the classroom.");
        }
        Assignment assignment = classroom.getAssignment(assignmentDetails);
        if (assignment == null) {
            throw new Exception("Assignment not found in the classroom.");
        }
        assignment.submitBy(student);
        LOGGER.info("Assignment submitted by Student " + studentId + " in " + className + ".");
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        System.out.println("Available Classrooms:");
        classrooms.keySet().forEach(className -> System.out.println("- " + className));
    }

    public void listStudents(String className) throws Exception {
        Classroom classroom = getClassroom(className);
        classroom.listStudents();
    }

    private Classroom getClassroom(String className) throws Exception {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new Exception("Classroom " + className + " does not exist.");
        }
        return classroom;
    }
}
