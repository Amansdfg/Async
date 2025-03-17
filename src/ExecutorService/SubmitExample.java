package ExecutorService;

import java.util.concurrent.*;

/*
    4. ExecutorService.submit()
    submit() запускает задачу и возвращает Future, который можно использовать для получения результата.
 */
public class SubmitExample {
    public static void main(String[] args) throws Exception {


        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> System.out.println("Hello from execute!"));

        // Запускает задачу, но не возвращает результат.



        Future<String> future = executor.submit(() -> "Привет из submit!");

        //Позволяет получить Future, чтобы обработать результат.
        //submit() возвращает Future, который можно использовать для получения результата.
        System.out.println(future.get());

        executor.shutdown();



//        ExecutorService executor = Executors.newFixedThreadPool(3);
//
//        List<Callable<String>> tasks = Arrays.asList(
//            () -> "Задача 1",
//            () -> "Задача 2",
//            () -> "Задача 3"
//        );
//
//        List<Future<String>> results = executor.invokeAll(tasks);
//      // invokeAll() запускает все задачи и возвращает список Future.
//        for (Future<String> result : results) {
//            System.out.println(result.get());
//        }
//         // invokeAll() блокирует выполнение, пока все задачи не завершатся.
//        executor.shutdown();
    }
}

