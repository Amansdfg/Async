package VirtualThreads;
/*
    Virtual Threads
    Виртуальные потоки - это новый механизм в Java, который позволяет создавать легковесные потоки, которые не связаны с системными потоками.
    Они могут быть созданы и управляться JVM, что позволяет создавать миллионы потоков без перегрузки системы.
    Виртуальные потоки могут быть созданы с помощью Thread.ofVirtual() и запущены с помощью метода start().
 */
public class VirtualThreadExample {
    public static void main(String[] args) {
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from Virtual Thread: " + Thread.currentThread());
        });
    }
}
