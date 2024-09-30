package Exercise_1.Creational.Thread_Pool_Manager;

public class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        if (taskName == null || taskName.isEmpty()) {
            throw new IllegalArgumentException("Task name cannot be null or empty.");
        }
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Executing " + taskName + " by " + Thread.currentThread().getName());
    }
}

