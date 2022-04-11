package Day_21_ArrayUtility;

public class Items {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jacket", "Gloves","ipad", "Bread"};
        double [] prices = {99.99, 150.0, 9.99, 250.0, 2.5 };
        int [] itemID = {12345, 12354,23456,65432,16794};

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemID[i];


            System.out.println(item+" - "+ id+ " - $"+price);
        }




    }
}
