package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    1. Stream API
    Stream API — это новый API в Java 8, который позволяет работать с коллекциями и данными в них.
    Stream API позволяет выполнять различные операции над данными, такие как фильтрация, сортировка, группировка и т. д.
 */

/*
    Все операции делятся на промежуточные и терминальные:

    Операция	Тип	Описание
    filter()	Промежуточная	Фильтрация элементов
    map()	    Промежуточная	Преобразование данных
    flatMap()	Промежуточная	Разворачивание вложенных структур
    sorted()	Промежуточная	Сортировка
    distinct()	Промежуточная	Удаление дубликатов
    limit()	    Промежуточная	Ограничение количества элементов
    skip()	    Промежуточная	Пропуск первых n элементов
    forEach()	Терминальная	Итерация по элементам
    collect()	Терминальная	Сбор результата в коллекцию
    count()	     Терминальная	Подсчёт элементов
    findFirst()	Терминальная	Первый элемент
    findAny()	Терминальная	Любой элемент
    anyMatch()	Терминальная	Проверяет, есть ли совпадения
    allMatch()	Терминальная	Все ли элементы соответствуют условию
    noneMatch()	Терминальная	Проверяет отсутствие совпадений
    reduce()	Терминальная	Агрегация значений
 */
public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        String[] array = {"Java", "Python", "C++"};
        Stream<String> stream1 = Stream.of(array);
        stream1.forEach(System.out::println);

        Stream<Integer> randomNumbers = Stream.generate(() -> (int) (Math.random() * 100));
        randomNumbers.limit(5).forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);

        List<String> names1 = List.of("Alice", "Bob", "Charlie");
        names1.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        List<Integer> numbersSorted = List.of(5, 3, 8, 1, 2);
        numbersSorted.stream()
            .sorted()
            .forEach(System.out::println);

        List<Integer> distinct = List.of(1, 2, 2, 3, 3, 3, 4);
        distinct.stream()
            .distinct()
            .forEach(System.out::println);

        List<String> words = List.of("A", "B", "C", "D", "E");
        words.stream()
            .skip(2)
            .forEach(System.out::println);

        List<Integer> numbersLimit = List.of(10, 20, 30, 40, 50);
        numbersLimit.stream()
            .limit(3)
            .forEach(System.out::println);


        List<String> namesNames = List.of("Alice", "Bob", "Charlie");
        List<String> uppercaseNames = namesNames.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println(uppercaseNames);

        List<Integer> numbersReduce = List.of(1, 2, 3, 4, 5);
        int sum = numbersReduce.stream()
            .reduce(0, Integer::sum);
        System.out.println(sum);


    }
}
