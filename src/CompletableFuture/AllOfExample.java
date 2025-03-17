package CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/*
    5. CompletableFuture.allOf()
    Запуск нескольких задач и ожидание завершения всех (allOf)
    allOf() завершится только после выполнения всех переданных задач.

 */

public class AllOfExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Void> future = CompletableFuture.allOf(
            CompletableFuture.runAsync(() -> delayPrint("Задача 1", 2)),
            CompletableFuture.runAsync(() -> delayPrint("Задача 2", 3))
        );

        future.get();
        System.out.println("Все задачи завершены!");
    }

    private static void delayPrint(String message, int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
            System.out.println(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
