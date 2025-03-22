package lab_1.data;

public class Square extends Rectangle {
    protected double sideLength;

    public Square(double sideLength) {
        super(sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public void displayInfo() {
        System.out.println("Square: Side Length = " + sideLength);
    }
}
