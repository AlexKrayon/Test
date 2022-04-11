package Day_38_InheritanceContinueTwo.Car;

public class ParkingLot {
    public static void main(String[] args) {
    Toyota toyota = new Toyota("Corolla", "White",2021,10000,150000);

    Tesla tesla = new Tesla("Model S","Black",2022,1000,145000);

    BMW bmw = new BMW("X5","Gray",2019,120000,150000);

    toyota.start();
    tesla.start();
    bmw.start();


    }



}
