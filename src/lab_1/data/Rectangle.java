package lab_1.data;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void displayInfo() {
        System.out.println("Rectangle: Length = " + length + ", Width = " + width);
    }
}