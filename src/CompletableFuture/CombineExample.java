package CompletableFuture;

import java.util.concurrent.CompletableFuture;

/*
    4. Combine thenCombine()
    Объединение результатов двух задач
    thenCombine() принимает результаты двух задач и возвращает новый.
 */
/*

    Комбинирование нескольких задач
    Выполнить две задачи параллельно и объединить их результаты
    thenCombine() позволяет объединить два CompletableFuture.
 */
public class CombineExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Привет");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "мир");

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (res1, res2) -> res1 + ", " + res2);

        System.out.println(combinedFuture.get());
    }
}
