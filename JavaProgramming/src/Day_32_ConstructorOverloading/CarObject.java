package Day_32_ConstructorOverloading;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Lexus", "RX350", 2011);
        Car car4 = new Car("Tofas", "Sahin", 1991, 20000);
        Car car5 = new Car("Scoda", "Favorit", 2015, 15000, "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);




    }
}
