package Week05;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid e-mail: ");
        String email = scan.next();
        String domain = email.substring(email.indexOf("@")+1);


        if (email.contains("@") && domain.contains(".")&&email.substring(0,email.indexOf("@")).length()>0 ){
            System.out.println("Email is valid.");
        }else{
            System.out.println("Email is NOT valid.");
        }

        System.out.println("_______________________________--");

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a valid email: ");
        String email1 = input.next();
        boolean result = true;

        int atSignIndex = email1.indexOf("@");
        int dotIndex = email1.lastIndexOf(".");

        if(atSignIndex<1 || atSignIndex>=email1.length()-3 || atSignIndex != email1.lastIndexOf("@")){
            result=false;
        }if(dotIndex<1|| dotIndex==email1.length()-1 ||atSignIndex>dotIndex || atSignIndex+1 == dotIndex){
            result=false;
        }
        System.out.println("result = " + result);





    }
}
