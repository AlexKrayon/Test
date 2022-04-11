package Week_04_ReviewSection;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack",
                drinkItem = "coffee",
                snackItem = "chips";

        if(selection == "drink"){
            System.out.println("drink obtion is selected.");
            if(drinkItem == "tea"){
                System.out.println("Tea item is selected");
            }else if (drinkItem == "coffee"){
                System.out.println("Coffee is selescted");
            }

        }else if (selection == "snack"){
            System.out.println("snack obtion selected");
            if(snackItem == "chips"){
                System.out.println("Chips is selected");
            }else if(snackItem == "candy"){
                System.out.println("Candy is selected");
            }

        }else{
            System.out.println("INVALID ENTRY");
        }


    }
}
