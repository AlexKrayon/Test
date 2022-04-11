package Day5_Concateration;

public class CarInfo {
    public static void main(String[] args) {

        int year = 2020;
        String make = "Toyota",
                model = "Corolla",
                miles = "7000 Miles",
                color = "White";
        int price = 20500;

        System.out.println(year + " " + make + " "+model+", "+miles+", "+color+", $"+price);
    }
}
