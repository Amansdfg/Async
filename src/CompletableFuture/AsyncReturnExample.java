package CompletableFuture;

import java.util.concurrent.CompletableFuture;

/*
    2. CompletableFuture.supplyAsync()
    Асинхронная задача с возвратом результата

    upplyAsync() используется, если задача возвращает результат.
 */
public class AsyncReturnExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Привет, мир!";
        });

        System.out.println(future.get());
    }
}
