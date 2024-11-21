import Classes.commisionPayment;
import Classes.hourlypayment;

public class Main {
    public static void main(String[] args) {



        hourlypayment student = new hourlypayment();
        student.pay = 15;
        student.hours= 39;
        System.out.println(student.Payment());

        //for commissions hours in not even a valid variable and as such is violating Liskovs
        commisionPayment student2 = new commisionPayment();
        student2.pay = 15;
        student2.bonus= 39;
        System.out.println(student2.Payment());
    }
}