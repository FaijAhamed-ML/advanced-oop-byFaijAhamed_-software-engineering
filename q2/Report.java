package lab09.q2;

public class Report implements Printable {
    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void printDetails() {
        System.out.println("The title of the report: "+title);
    }
}
