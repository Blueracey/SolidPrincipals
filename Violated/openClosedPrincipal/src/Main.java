import Classes.fruit;
import Classes.fruitPricer;

public class Main {
    public static void main(String[] args) {



        fruit apple = new fruit();
        fruit banana = new fruit();

        banana.Weight = 1.5;
        banana.price = 3.44;
        banana.name = "Banana";
        apple.price = 4;
        apple.name = "Apple";

        fruitPricer pricer = new fruitPricer();

        System.out.println(pricer.fruitPricer(apple));
        System.out.println(pricer.fruitPricer(banana));
    }
}