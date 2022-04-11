package Day_31_Constructors;

public class Pizza {
    public char size;
    public int numberOfCheese, numberOfPepperoni;

    public Pizza(char size, int numberOfCheese, int numberOfPepperoni) {
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheese=" + numberOfCheese +
                ", numberOfPepperoni=" + numberOfPepperoni +
                ", totalPrice =$ " + calCost() +
                '}';
    }

    public double calCost(){
        double startingPrice = (size == 'S')? 10 : (size=='M')? 12 :14;
        double totalPrice = startingPrice + (numberOfCheese+numberOfPepperoni)*2;
        return totalPrice;

    }


}
