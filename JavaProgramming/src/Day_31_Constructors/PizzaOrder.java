package Day_31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza small = new Pizza('S',2,3);
            Pizza medium = new Pizza('M',4,5);
            Pizza large = new Pizza('L',5,7);

            pizzas.addAll(Arrays.asList(small,medium,large));

        }
        System.out.println("Total number of pizza: "+pizzas.size());
        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice+=pizza.calCost();
        }
        System.out.println("totalPrice = $ " + totalPrice);

        
    }
}
