package VirtualThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    2. Virtual Threads
    Executors.newVirtualThreadPerTaskExecutor() создаёт ExecutorService, который использует виртуальные потоки.
    Виртуальные потоки позволяют создавать миллионы потоков, не используя миллионы реальных потоков.
 */
public class VirtualThreadsExecutor {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                int taskId = i;
                executor.submit(() -> {
                    System.out.println("Task " + taskId + " running in " + Thread.currentThread());
                });
            }
        }
    }
}

