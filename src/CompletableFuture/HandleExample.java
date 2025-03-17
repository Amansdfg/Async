package CompletableFuture;

import java.util.concurrent.CompletableFuture;

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
