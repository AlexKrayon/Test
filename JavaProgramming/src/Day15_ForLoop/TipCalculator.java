package Day15_ForLoop;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split od No split (Yes or No)?");
        String yesOrNo = scan.next().toLowerCase();

        System.out.println("Enter number of people: ");
        int numOfPeople = scan.nextInt();

        System.out.println("Enter the check amount: ");
        double amount = scan.nextDouble();

        System.out.println("How was the service? (Excellent/Great/Good/Fair/Poor)");
        String service = scan.next().toLowerCase();

        double tipRate = (service.equals("excellent"))? 0.25 : (service.equals("great"))? 0.2
                : (service.equals("good"))? 0.15 : (service.equals("fair"))? 0.1 : 0.05;
        double totalTip = amount*tipRate;

        System.out.println("Number of people entered:  " + numOfPeople);
        System.out.println(" Total pay to: " + amount);
        System.out.println("Total tip: " + totalTip);

        if(yesOrNo.equals("yes")){
            System.out.println("Total per person: " + (amount/numOfPeople));
            System.out.println("Tip per person:  " + (totalTip/numOfPeople));
        }
        scan.close();

    }
}
