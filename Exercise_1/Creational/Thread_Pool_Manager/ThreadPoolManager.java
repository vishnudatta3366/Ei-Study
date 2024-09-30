package Exercise_1.Creational.Thread_Pool_Manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolManager {
    private static volatile ThreadPoolManager instance;
    private ExecutorService executorService;

    private ThreadPoolManager() {
        // Initialize a fixed thread pool with 5 threads
        executorService = Executors.newFixedThreadPool(5);
    }

    public static ThreadPoolManager getInstance() {
        if (instance == null) {
            synchronized (ThreadPoolManager.class) {
                if (instance == null) {
                    instance = new ThreadPoolManager();
                }
            }
        }
        return instance;
    }

    public void executeTask(Runnable task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null.");
        }
        executorService.execute(task);
    }

    public void shutdown() {
        executorService.shutdown();
    }
}

