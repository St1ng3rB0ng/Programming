package lab_8.data;

public class SynchronizedPrinter {


    public synchronized void printMessage(String message) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " починає друк: " + message);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(name + "was interrupted");
        }
        System.out.println(name + " закінчив друк: " + message);
    }
}
