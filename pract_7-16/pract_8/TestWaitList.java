//file TestWaitList.java
package pract_8;

import java.util.ArrayList;
import java.util.Collection;

public class TestWaitList {
    public static void main(String[] args){
        BoundedWaitList list1 = new BoundedWaitList(20);
        UnfairWaitList list2 = new UnfairWaitList();

        System.out.println("---------------BoundedWaitList--------------- ");
        list1.add(34);
        list1.add(91);
        list1.add(8);
        System.out.println("Capacity: " + list1.getCapacity() + ";\n" + list1.toString());
        if (list1.contains(34)){
            System.out.println("Object '34' is in the deque");
        }
        else{
            System.out.println("Object '34' is not in the deque");
        }
        list1.remove();
        System.out.println("After removing: " + list1.toString());


        System.out.println("---------------UnfairWaitList--------------- ");
        list2.add(23);
        list2.add(2);
        list2.add(59);
        System.out.println(list2.toString());
        list2.remove(23);
        System.out.println("After removing: " + list2.toString());
        list2.moveToBack(999);
        System.out.println("After moving to back: " + list2.toString());
        Collection c = new ArrayList();
        c.add(59);
        c.add(2);
        if (list2.containsAll(c)){
            System.out.println("Collection is in the deque");
        }
        else{
            System.out.println("Collection is not in the deque");
        }

    }
}
