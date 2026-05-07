package lab09.q2;

public class Invoice implements Printable {
    private String InvoiceId;

    public Invoice(String invoiceId) {
        this.InvoiceId = invoiceId;
    }

    @Override
    public void printDetails() {
        System.out.println("The Invoice Id is: "+InvoiceId);
    }
}
