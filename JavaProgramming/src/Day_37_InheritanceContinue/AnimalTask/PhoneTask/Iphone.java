package Day_37_InheritanceContinue.AnimalTask.PhoneTask;

public class Iphone extends Phone {
    public Iphone(String model, String size, String color, double price) {
        super("Apple", model,size,color,price);
    }

    public void faceTime (long phoneNumber){
        System.out.println(brand + " "+model+" is having face time "+ phoneNumber);
    }

    public void faceTime (String email){
        System.out.println(brand + " "+model+" is having face time with email "+ email);
    }



}
