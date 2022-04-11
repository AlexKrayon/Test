package Day_37_InheritanceContinue.AnimalTask.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("Iphone5","6.7 inches", "White", 10000);

        Samsung samsung = new Samsung("A5","6 inc","Black",9000);

        Nokia nokia = new Nokia("Brick","4 in","Black",4000);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(9887546433l);
        iphone.faceTime(84557643322l);
        iphone.faceTime("yahoo.com");




    }

}
