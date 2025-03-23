package lab_5.data;

import java.util.Arrays;

public class Report<T> {
    private T data;

    public Report(T data) {
        this.data = data;
    }

    public void generateTextReport() {System.out.println("Text Report: " + (data instanceof Object[] ? Arrays.toString((Object[]) data) : data.toString()));}

    public void generateHtmlReport() {System.out.println("<html><body>" + (data instanceof Object[] ? Arrays.toString((Object[]) data) : data.toString()) + "</body></html>");}
}