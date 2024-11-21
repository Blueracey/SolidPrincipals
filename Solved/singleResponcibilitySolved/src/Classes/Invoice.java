package Classes;

public class Invoice {


    Program program;
    int hours ;
    double discount;

    double total;






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

    //as you can see the Invoice printer has been moved to its own class


}
