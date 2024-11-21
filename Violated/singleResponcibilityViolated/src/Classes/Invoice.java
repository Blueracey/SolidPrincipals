package Classes;

public class Invoice {


    private Program program;
    private int hours ;
    private double discount;

    private double total;






    public Invoice(Program program, int hours, double discount) {
        this.program = program;
        this.hours = hours;
        this.discount = discount;

        this.total = calculateTotal();
    }

    public double calculateTotal(){
        double price = ((program.price)*hours)-discount;




        return price;
    }


    //here is the problem the class dedicated to calculating the invoice should not also have to print it
    public void printInvoice(){

        System.out.println("Instructor: " + program.instructor);
        System.out.println("Hours billed :" + hours );
        System.out.println("Discount :" + discount );

        System.out.println("Total :" + total );


    }
}
