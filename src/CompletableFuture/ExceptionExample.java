package CompletableFuture;

import java.util.concurrent.CompletableFuture;

/*
    7. exceptionally(), handle()
    Обработка исключений (exceptionally, handle)
    exceptionally() — обработка ошибки и возврат значения по умолчанию

 */

public class ExceptionExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Object> future = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("Ошибка!");
        }).exceptionally(ex -> {
            System.out.println("Произошла ошибка: " + ex.getMessage());
            return 0;
        });

        System.out.println(future.get());
    }
}
