package Day_52_Map_FunctionalInterface_Lambda;

public class Test {
    public static void main(String[] args) {
        // create a function a number is odd or even
        FirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if(n%2==0){
                System.out.println(n+" is even number.");
            }else {
                System.out.println(n+" is odd number.");
            }
        };
        oddOrEvenNumber.apply(23);

        // create a function that a person is eligible to buy alcohol
        FirstFunctionalInterface eligibleToBuyAlcohol = (age) -> {
            if(age >= 21){
                System.out.println("Eligible to buy alcohol.");
            }else{
                System.out.println("NOT eligible to buy alcohol.");
            }
        };
        eligibleToBuyAlcohol.apply(45);

        // create a function that can display the cube of a number
    FirstFunctionalInterface printCube;
    printCube = (n) -> {
        System.out.println(n*n*n);
    };
    printCube.apply(4);

        // create a function that evenly divisible 3 and 5

        FirstFunctionalInterface divisibleBy3And5;
        divisibleBy3And5 = n -> {
            if(n%3==0 && n%5==0){
                System.out.println(n+ " is divisible by 3 and 5");
            }else {
                System.out.println(n+ " is NOT divisible by 3 and 5");
            }
        };

        divisibleBy3And5.apply(35);




    }
}
