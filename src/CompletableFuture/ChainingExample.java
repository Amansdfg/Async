package CompletableFuture;

import java.util.concurrent.CompletableFuture;

/*
    3. CompletableFuture.thenApply()
    Чейнинг (цепочка задач)
    thenApply() принимает результат предыдущей задачи и возвращает новый.

 */

public class ChainingExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Привет")
            .thenApply(msg -> msg + ", мир")
            .thenApply(String::toUpperCase);

        System.out.println(future.get());
    }
}
