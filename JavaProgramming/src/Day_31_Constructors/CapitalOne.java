package Day_31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Muhtar Oz",8765432);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(400);
        account1.checkBalance();
        System.out.println("-------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Ali Ak",98742523);

        account2.deposit(20000);
        account2.checkBalance();




    }
}
