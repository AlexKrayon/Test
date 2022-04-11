package Week_04_ReviewSection;

public class NestedIf {
    public static void main(String[] args) {

        boolean IsRushHour = false;
        int carType = 2;
        double price = 0.0;


        if(carType == 1) {
            if (IsRushHour) {
                price = 30.0;
            } else {
                price = 5.0;
            }
        }else if (carType == 2){
                if(IsRushHour){
                    price = 55.0;
                }else{
                    price = 15.99;
                }

            }
        System.out.println(price);
        }



    }

