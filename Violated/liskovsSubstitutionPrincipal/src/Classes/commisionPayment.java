package Classes;


public class commisionPayment extends hourlypayment{
    public double pay;
    public double bonus;





    @Override
    public double Payment() {
        return pay+bonus;
    }
}
