package ExecutorService;

import java.util.concurrent.*;

/*
    2. Остановка ExecutorService
    shutdown() завершает работу ExecutorService после завершения всех задач.
    awaitTermination() ожидает завершения всех задач в течение определённого времени.
    shutdownNow() завершает работу ExecutorService немедленно.
 */
public class ShutdownExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Задача завершена");
            } catch (InterruptedException e) {
                System.out.println("Задача прервана");
            }
        });

        executor.shutdown();
        if (!executor.awaitTermination(3, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }
        System.out.println("Executor завершён");
    }
}

