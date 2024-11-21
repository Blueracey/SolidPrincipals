import Classes.Invoice;
import Classes.Program;
import Classes.InvoicePrinter;


public class Main {
    public static void main(String[] args) {


        Program program = new Program("Weightlifting","John",18);
        Invoice invoice = new Invoice(program,5,15);
        InvoicePrinter printer = new InvoicePrinter(invoice);

        printer.printInvoice();




    }

}
