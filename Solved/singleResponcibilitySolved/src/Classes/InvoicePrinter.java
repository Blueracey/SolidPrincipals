package Classes;
//invoice printer now has it's own class
public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }


    public void printInvoice(){

        System.out.println("Instructor: " + invoice.program.instructor);
        System.out.println("Hours billed :" + invoice.hours );
        System.out.println("Discount :" + invoice.discount );

        System.out.println("Total :" + invoice.total );


    }






}
