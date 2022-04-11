package Week_9_Review;

public class CustomMethods {
    public static void main(String[] args) {
        int personAge = 10;
        if(personAge>= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        int persontwoAge = 20;
        if(persontwoAge>= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        int personthreeAge = 30;
        if(personthreeAge>= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }


            System.out.println("==============================");

            eligibleOrNot(personAge);
            eligibleOrNot(persontwoAge);
            eligibleOrNot(personthreeAge);
            eligibleOrNot(45);
            eligibleOrNot(18);
            eligibleOrNot(75);
        }

        public static void eligibleOrNot(int age){  // no return type
            if(age >= 21){
                System.out.println("Eligible");
            }else{
                System.out.println("Not eligible to buy");
            }
        }
    }

