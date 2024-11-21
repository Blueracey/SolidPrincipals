package Classes;

import java.util.Objects;

public class fruitPricer {



    // this class is the problem to  add anything new to fruit Pricer I would have to modify this code before adding anything new
    public double fruitPricer(fruit Fruit) {


        if(Objects.equals(Fruit.name, "Apple")){
            return Fruit.price; //apples are priced individualy
        }
        else if (Objects.equals(Fruit.name, "Banana")) {
            return Fruit.price*Fruit.Weight; //bananas are priced by weight
        }

        return 0;
    }





}



