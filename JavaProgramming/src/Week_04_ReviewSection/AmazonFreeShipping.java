package Week_04_ReviewSection;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        double totalPrice = 20.50;

        if (totalPrice >= 25.0){
            System.out.println("Free Shipping eligible. Your order total : € "+ totalPrice);
        }else{
            System.out.println( "NOT Eligible for free shipping : € "+ totalPrice);
        }
        System.out.println( "Thanks for shopping with us.");
    }
}
