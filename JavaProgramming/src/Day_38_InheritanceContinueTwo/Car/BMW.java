package Day_38_InheritanceContinueTwo.Car;

public class BMW extends Car {


    public BMW(String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }




    public void racing(){
        System.out.println(brand+" "+model+" is a racing car.");
    }

    public void breaksDown() {
        System.out.println(brand + " " + model + " breaks down every 100 miles.");
    }


    @Override
    public void start(){
        System.out.println("Call machine to jump start "+brand+" "+model);
    }

}
