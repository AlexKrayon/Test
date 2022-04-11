package Day7_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 100;
        System.out.println(a--);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(a++);
        System.out.println(--a);

        System.out.println("-------------------------------");

        int x = 100;
        System.out.println("x = "+ x);
        System.out.println(x + 200);

        x = 400;

        x += 200;
        System.out.println("x = "+x);

        System.out.println("--------------------------------------");

        double availableBalance = 1000.50;
        // deposit 300$
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);


        System.out.println("--------------------------------------");
        // withdrawing 500$

        availableBalance += 500;

        System.out.println("availableBalance = " + availableBalance);

        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        availableBalance -= 400;
        System.out.println("availableBalance = " + availableBalance);

        availableBalance += 100;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("--------------------------------------");

        double salary = 50_000.5;
        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.0000001;
        doge *= 1000000;

        System.out.println("doge = " + doge);

        System.out.println("--------------------------------------");

        double num2 = 25000.0;
        num2 /= 2; // num2 = num2 / 2

        System.out.println("num2 = " + num2);

        System.out.println("--------------------------------------");

        double num3 = 100; // %=
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("--------------------------------------");

        int amount = 127; // cents
        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("--------------------------------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("--------------------------------------");
        
        int balance = 3500; // fee : $153
        balance %= 153;
        System.out.println("balance = " + balance);
        
        








        




    }
}
