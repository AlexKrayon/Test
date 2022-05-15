package Day_49_CollectionCont;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,40,60,300,90));
        list.addAll(Arrays.asList(10,200,40,60,300,90));
        list.addAll(Arrays.asList(10,200,40,60,300,90));
        list.addAll(Arrays.asList(10,200,40,60,300,90));
        list.addAll(Arrays.asList(10,200,40,60,300,90));

        System.out.println("list = " + list); // hepsini yazdırıyor.
                

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,40,60,300,90));
        hashSet.addAll(Arrays.asList(10,200,40,60,300,90));
        hashSet.addAll(Arrays.asList(10,200,40,60,300,90));
        hashSet.addAll(Arrays.asList(10,200,40,60,300,90));
        hashSet.addAll(Arrays.asList(10,200,40,60,300,90));

        System.out.println("hashSet = " + hashSet); // dublicated olanları kabul etmiyor. Bu nedenle sadece 5 yazdırıyor.
        
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        
        Set<Integer> treeSet = new TreeSet<>();
        
        
        
        
        
    }
}
