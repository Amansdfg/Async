package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    1. Создание ExecutorService

    Executors.newFixedThreadPool(3) создаёт пул из 3 потоков, которые будут использоваться повторно.

    Executors.newFixedThreadPool(n)	    |  Фиксированный пул из n потоков
    Executors.newCachedThreadPool()	    |  Динамически создаёт потоки при необходимости
    Executors.newSingleThreadExecutor()	|  Один поток для всех задач (очередь)
    Executors.newScheduledThreadPool(n)	|  Планировщик задач, выполняет задачи через определённые интервалы
 */
public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> System.out.println("Задача 1 выполняется"));
        executor.submit(() -> System.out.println("Задача 2 выполняется"));
        executor.submit(() -> System.out.println("Задача 3 выполняется"));

        executor.shutdown();
    }
}
