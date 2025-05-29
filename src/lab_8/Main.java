package lab_8;

//Задача 1:Напишіть клас, який використовує ReentrantReadWriteLock
//для безпечного читання та запису даних з різних потоків
//Задача 2:Розробіть клас, який має метод, що викликається з різних потоків. Застосуйте
//synchronized для забезпечення коректності виконання методу
//Задача 3:Використовуйте Phaser для координації трьох потоків, які виконують роботу
//в різних фазах. Виведіть повідомлення про завершення кожної фази.
//Потім напиши пояснення як працюють потоки, як працюють різні бібліотеки та синхронізація

import lab_8.data.SafeDataStore;
import lab_8.data.SynchronizedPrinter;

import java.util.concurrent.Phaser;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Задача 1
        SafeDataStore store = new SafeDataStore();
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                store.put("key" + i, "value" + i);
                System.out.println("Written: key" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Writer interrupted");
                }
            }
        });
        Thread reader = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(store.get("key" + i));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Reader interrupted");
                }
            }
        });

        //Задача 2
        SynchronizedPrinter printer = new SynchronizedPrinter();

        Thread prant = new Thread(() -> {
            printer.printMessage("Hello");
        });
        Thread prent = new Thread(() -> {
            printer.printMessage("Java, it's");
        });
        Thread print = new Thread(() -> {
            printer.printMessage("me world!");
        });

        //Задача 3
        Phaser phaser = new Phaser(3); // 3 parties

        Runnable task = () -> {
            String name = Thread.currentThread().getName();

            for (int phase = 0; phase < 3; phase++) {
                System.out.println(name + " starts phase " + phase);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println(name + " was interrupted");
                }
                System.out.println(phaser.arriveAndAwaitAdvance() + " - next phase for" + name);
                System.out.println(name + " ends phase " + phase);
            }
        };
        Thread starter = new Thread(
                () -> {
                    try {
                        writer.start();
                        Thread.sleep(100);
                        reader.start();
                        Thread.sleep(2000);
                        System.out.print("\n");
                        prant.start();
                        Thread.sleep(500);
                        prent.start();
                        Thread.sleep(500);
                        print.start();
                        Thread.sleep(2000);
                        System.out.print("\n");
                        new Thread(task, "A").start();
                        new Thread(task, "B").start();
                        new Thread(task, "C").start();
                        // new Thread(task, "D").start();
                        //AmongUs, D-need registration to not break sync
                    } catch (InterruptedException e) {
                        System.err.println("Starter was interrupted");
                    }
                }
        );
        starter.start();
    }
}

