package Day_49_CollectionCont;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<Integer> priority = new PriorityQueue<>();
        priority.addAll(Arrays.asList(10,200,300,40,90,30));

        System.out.println("priority = " + priority);

        Queue<Integer>arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90,30));

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer>linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90,30));

        System.out.println("linkedList = " + linkedList);

        System.out.println("*********************************");

        priority.poll();
        System.out.println(priority);

        priority.poll();
        System.out.println(priority);

        priority.poll();
        System.out.println(priority);

        priority.poll();
        System.out.println(priority);

        priority.poll();
        System.out.println(priority);
        
        
    }
}
