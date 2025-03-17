package CompletableFuture;

import java.util.concurrent.CompletableFuture;

/*
    1. CompletableFuture.runAsync()
    * Создание асинхронной задачи
    * runAsync() используется, если задача не возвращает результат.
 */

public class AsyncExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Выполняем задачу в потоке: " + Thread.currentThread().getName());
        });

        future.get();
    }
}
