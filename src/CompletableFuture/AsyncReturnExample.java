package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class AsyncReturnExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Привет, мир!";
        });

        System.out.println(future.get()); // Выведет: Привет, мир!
    }
}
