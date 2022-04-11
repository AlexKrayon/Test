package Day_31_Constructors;

public class BankAccount {
    public String accountName;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountName, long accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $ " + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Depositing amount can not be zero or negative.");
            return;
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance.");
            return;
        }
        if(amount<=0){
            System.out.println("Withdrawing amount can not be negative or zero.");
            return;
        }

        balance-=amount;

    }




}
