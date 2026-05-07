package lab09.q2;

public class main {
    public static void main(String[] args) {
        Report R1= new Report("Sales");
        Report R2= new Report("Revenue");
        Invoice In1= new Invoice("IN112043");
        Invoice In2= new Invoice("IN443376");

        Printable[] printqueue={R1,R2,In1,In2};

        System.out.println("Executing Print Queue....");
        for (Printable items: printqueue){
            items.printDetails();
            System.out.println();
        }

    }
}
