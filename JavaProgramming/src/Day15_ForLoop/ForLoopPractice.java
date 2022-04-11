package Day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i = 15; i <=45; i++){
            System.out.print(i+" "); // alt alta olması icin (i+\n
        }

        System.out.println();
        System.out.println("Hello");

        System.out.println("--------------------------------");
        for(int i = 100; i>=50; i-- ){ //i: 100,99,98......50
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("---------------------------------------");

        // print all the even numbers between 1 to 55

        for(int i = 1; i<=55; i++  ){
            System.out.print(i+" ");
        }

        System.out.println("------------------------------");
        for(int i = 2; i<=54; i+=2  ){
            System.out.print(i+", ");
        }




    }
}
