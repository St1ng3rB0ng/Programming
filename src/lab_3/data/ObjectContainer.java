package lab_3.data;

public class ObjectContainer {
    private Object[] objects = new Object[3];
    private int index = 0;

    public void add(Object obj) {
        objects[index++] = obj;
    }

    public void displayInfo() {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }
}