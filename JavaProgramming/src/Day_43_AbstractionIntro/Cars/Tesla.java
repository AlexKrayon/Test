package Day_43_AbstractionIntro.Cars;

public final class Tesla extends Car {


    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\"");
    }
    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has a auto pilot.");
    }



}
