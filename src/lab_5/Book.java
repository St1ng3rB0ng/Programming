package lab_5;

public record Book(String title, double price) {
    public double calculateCost(int quantity) {
        return price * quantity;
    }
}