package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class ChainingExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Привет")
            .thenApply(msg -> msg + ", мир")
            .thenApply(String::toUpperCase);

        System.out.println(future.get()); // Выведет: ПРИВЕТ, МИР
    }
}
