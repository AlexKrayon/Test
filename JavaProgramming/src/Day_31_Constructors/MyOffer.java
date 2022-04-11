package Day_31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {

    Offer offer1 = new Offer();
    Offer offer2 = new Offer();
    Offer offer3 = new Offer();
    Offer offer4 = new Offer();
    Offer offer5 = new Offer();

    offer1.setInfo("MD","Melasoft","Sales", 120000,true,true, false, true);
    offer2.setInfo("VA","Cydeo","QA", 100000,false,true, false, false);
    offer3.setInfo("DC","Amazon","DevOps", 130000,true,false, true, true);
    offer4.setInfo("TX","Bank of America","Counter", 90000,true,false, true, true);
    offer5.setInfo("UT","University","Instructor", 140000,true,false, true, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);


        System.out.println("---------------------------");
        

        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffers.size());
        System.out.println("fullTimeOffers = " + fullTimeOffers.size());

        System.out.println("---------------------------");

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !(p.location.equals("VA") && p.location.equals("TX")));
        System.out.println(localOffers.size());

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+" : "+localOffer.salary);
        }

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit);
        System.out.println(offersWithBenefits.size());

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p-> p.salary>=100000);
        System.out.println(offersWith100K.size());










    }

}
