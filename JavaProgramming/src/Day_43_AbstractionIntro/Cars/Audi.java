package Day_43_AbstractionIntro.Cars;

public final class Audi extends Car{


    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start");
    }

    public void autopark(){
        System.out.println(getBrand()+" "+getModel()+"has auto park feature");
    }



}
