package Exercise_1.Creational.Thread_Pool_Manager;


public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolManager threadPool = ThreadPoolManager.getInstance();

        for (int i = 1; i <= 10; i++) {
            threadPool.executeTask(new Task("Task " + i));
        }

        threadPool.shutdown();
    }
}

