package Utilities;

import Day_40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierTest2 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        //System.out.println(AccessModifierTest2.name1);//default yine gorunmedi
        System.out.println(AccessModifierTest2.name2);//protected sub class olunca paket dısında da görunur.



    }

}
