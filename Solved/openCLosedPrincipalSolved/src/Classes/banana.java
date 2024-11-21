package Classes;

public class banana extends fruit{

    public double price;
    public double weight;
    @Override
    public double fruitPricer() {
        return price*weight;
    }
}
