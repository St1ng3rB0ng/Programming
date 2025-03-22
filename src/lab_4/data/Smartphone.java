package lab_4.data;

public class Smartphone implements Connectable {
    public void connectToNetwork(String network) {
        System.out.println("Smartphone connected to " + network);
    }
}