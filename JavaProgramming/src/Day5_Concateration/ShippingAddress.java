package Day5_Concateration;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Ahmet Has";
        String buildingNumber = "11832F",
                streetName = "İnclead Dr.",
                city = "Laurel",
                state = "MD",
                zipcode = "20819A";
        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state +", " + zipcode +".";

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state +", " + zipcode +".");

        System.out.println(address);


    }
}
