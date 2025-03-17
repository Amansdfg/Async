package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class AsyncExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Выполняем задачу в потоке: " + Thread.currentThread().getName());
        });

        future.get(); // Ждем завершения
    }
}
