public class Car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public String color;


    public Car (String brand){
        this.brand=brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }

    public Car(String brand, String model, int year, double price, String color) {
        this(brand, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }

}

class CarObject{
    public static void main(String[] args) {

        Day_32_ConstructorOverloading.Car car1 = new Day_32_ConstructorOverloading.Car("Toyota");
        Day_32_ConstructorOverloading.Car car2 = new Day_32_ConstructorOverloading.Car("Honda", "Civic");
        Day_32_ConstructorOverloading.Car car3 = new Day_32_ConstructorOverloading.Car("Lexus", "RX350", 2011);
        Day_32_ConstructorOverloading.Car car4 = new Day_32_ConstructorOverloading.Car("Tofas", "Sahin", 1991, 20000);
        Day_32_ConstructorOverloading.Car car5 = new Day_32_ConstructorOverloading.Car("Scoda", "Favorit", 2015, 15000, "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);




    }

}

