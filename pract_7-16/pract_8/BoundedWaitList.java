//file BoundedWaitList.java
package pract_8;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void add(E e){
        if (deque.size() < capacity){
            deque.add(e);
        }
    }

    public String toString(){
        String s = "";
        for (E e: deque){
            s = s + " " + e;
        }
        return s;
    }
}
