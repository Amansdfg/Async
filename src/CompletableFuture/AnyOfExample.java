package CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/*
    6. AnyOf
    Ожидание первой завершившейся задачи (anyOf)
    anyOf() завершится, как только завершится первая из переданных задач.

 */

public class AnyOfExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> delayReturn("Первый", 3));
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> delayReturn("Второй", 1));

        CompletableFuture<Object> result = CompletableFuture.anyOf(future1, future2);

        System.out.println(result.get());
    }

    private static String delayReturn(String message, int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }
}

