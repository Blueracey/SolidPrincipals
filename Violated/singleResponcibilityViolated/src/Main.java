import Classes.Invoice;
import Classes.Program;

public class Main {
 public static void main(String[] args) {


    Program program = new Program("Weightlifting","John",18);
    Invoice invoice = new Invoice(program,5,15);
     invoice.printInvoice();




}

}


//https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/
//https://www.geeksforgeeks.org/solid-principle-in-programming-understand-with-real-life-examples/