package lab_5;

public class Report<T> {
    private T data;

    public Report(T data) {
        this.data = data;
    }

    public void generateTextReport() {
        System.out.println("Text Report: " + data);
    }

    public void generateHtmlReport() {
        System.out.println("<html><body>" + data + "</body></html>");
    }
}