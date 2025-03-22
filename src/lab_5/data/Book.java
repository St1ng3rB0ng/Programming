package lab_5.data;

public record Book(String title, double price) {
    public double calculateCost(int quantity) {
        return price * quantity;
    }
}