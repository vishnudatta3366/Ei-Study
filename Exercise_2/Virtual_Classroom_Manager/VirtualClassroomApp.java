// VirtualClassroomApp.java
import java.util.Scanner;
import java.util.logging.Logger;

public class VirtualClassroomApp {
    private static final Logger LOGGER = Logger.getLogger(VirtualClassroomApp.class.getName());
    private final ClassroomManager manager = ClassroomManager.getInstance();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        LOGGER.info("Application started.");
        while (true) {
            displayMenu();
            String input = scanner.nextLine().trim();
            try {
                if (!processInput(input)) {
                    break;
                }
            } catch (Exception e) {
                LOGGER.severe("Error: " + e.getMessage());
                System.out.println("Error: " + e.getMessage());
            }
        }
        LOGGER.info("Application terminated.");
    }

    private void displayMenu() {
        System.out.println("\nEnter command:");
        System.out.println("add_classroom [class_name]");
        System.out.println("add_student [student_id] [class_name]");
        System.out.println("schedule_assignment [class_name] [assignment_details]");
        System.out.println("submit_assignment [student_id] [class_name] [assignment_details]");
        System.out.println("list_classrooms");
        System.out.println("list_students [class_name]");
        System.out.println("exit");
    }

    private boolean processInput(String input) throws Exception {
        if (input.isEmpty()) {
            return true;
        }

        String[] parts = input.split("\\s+", 2);
        String command = parts[0];
        String arguments = parts.length > 1 ? parts[1] : "";

        switch (command) {
            case "add_classroom":
                manager.addClassroom(arguments);
                break;
            case "add_student":
                processAddStudent(arguments);
                break;
            case "schedule_assignment":
                processScheduleAssignment(arguments);
                break;
            case "submit_assignment":
                processSubmitAssignment(arguments);
                break;
            case "list_classrooms":
                manager.listClassrooms();
                break;
            case "list_students":
                manager.listStudents(arguments);
                break;
            case "exit":
                return false;
            default:
                System.out.println("Invalid command.");
        }
        return true;
    }

    private void processAddStudent(String args) throws Exception {
        String[] tokens = args.split("\\s+");
        if (tokens.length != 2) {
            throw new IllegalArgumentException("Usage: add_student [student_id] [class_name]");
        }
        manager.addStudent(tokens[0], tokens[1]);
    }

    private void processScheduleAssignment(String args) throws Exception {
        String[] tokens = args.split("\\s+", 2);
        if (tokens.length != 2) {
            throw new IllegalArgumentException("Usage: schedule_assignment [class_name] [assignment_details]");
        }
        manager.scheduleAssignment(tokens[0], tokens[1]);
    }

    private void processSubmitAssignment(String args) throws Exception {
        String[] tokens = args.split("\\s+", 3);
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Usage: submit_assignment [student_id] [class_name] [assignment_details]");
        }
        manager.submitAssignment(tokens[0], tokens[1], tokens[2]);
    }
}
