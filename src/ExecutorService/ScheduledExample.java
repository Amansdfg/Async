package ExecutorService;

import java.util.concurrent.*;

/*
    4. Планировщик задач
    ScheduledExecutorService позволяет выполнять задачи через определённые интервалы.
    schedule() выполняет задачу через определённое время.
    scheduleAtFixedRate() выполняет задачу через определённое время и повторяет через определённые интервалы.
 */
public class ScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> System.out.println("Задача выполнена через 2 секунды"), 2, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> System.out.println("Периодическая задача"), 1, 3, TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}
