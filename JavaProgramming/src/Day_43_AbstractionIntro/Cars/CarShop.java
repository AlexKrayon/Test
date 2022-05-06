package Day_43_AbstractionIntro.Cars;

public class CarShop {
    public static void main(String[] args) {

       // Car car1 = new Car("Cydeo", "25","Blue", "2022","20000"); we can not create object from Abstract class, because abs class is not concrete.

        Honda honda = new Honda("Accord","Black", 2021,120000);

        Audi audi = new Audi("Q7","Blue", 2020, 30000);

        Tesla tesla = new Tesla("Model3", "White", 2022, 600000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("*********************************");

        honda.setColor("Red");
        audi.setColor("Green");
        tesla.setColor("Pink");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("*********************************");

        honda.setPrice(300000);
        audi.setPrice(10000);
        tesla.setPrice(800000);
        tesla.setColor("Grey");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);






    }


}
