import Classes.apple;
import Classes.banana;
import Classes.fruit;


public class Main {
    public static void main(String[] args) {



        apple Apple = new apple();
        banana Banana = new banana();

        Banana.price = 4.12;
        Banana.weight = 2.5;
        Apple.price = 3.44;
        System.out.println(Apple.fruitPricer());
        System.out.println(Banana.fruitPricer());
    }
}