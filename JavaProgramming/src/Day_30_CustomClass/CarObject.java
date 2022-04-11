package Day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
       Car car1 = new Car();

       car1.setInfo("Tofaş", "Sahin", "White", 1990, 150000);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Toyota","Corolla", "White", 2022, 352000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("BMW","35W", "White", 2020, 52000);
        System.out.println(car3);

        // Car[]cars = {car1,car2,car3};

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carList) {
            System.out.println(each.brand+ " : "+each.price);
        }

        System.out.println("--------------------------------");

        carList.removeIf(p-> p.brand.equals("Tofaş") && p.year >= 1990 && p.year <= 2000);
        carList.removeIf(p-> p.brand.equals("BMW") && p.year >= 2000 && p.year <= 2020);

        System.out.println(carList);



    }

}
