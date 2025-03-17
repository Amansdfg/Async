package CompletableFuture;

import java.util.concurrent.CompletableFuture;

/*
    8. CompletableFuture.handle()
    handle() — обработка ошибки и выполнение альтернативной логики


    handle() позволяет как обработать исключение, так и продолжить выполнение с другим результатом.
 */
public class HandleExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Object> future = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("Ошибка!");
        }).handle((res, ex) -> {
            if (ex != null) {
                System.out.println("Произошла ошибка: " + ex.getMessage());
                return -1;
            }
            return res;
        });

        System.out.println(future.get());
    }
}
