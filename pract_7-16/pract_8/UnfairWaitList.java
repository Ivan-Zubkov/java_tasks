//file UnfairWaitList.java
package pract_8;

public class UnfairWaitList<E> extends WaitList<E>{

    public UnfairWaitList() {}

    public void remove(E e){
        deque.remove(e);
    }

    public void moveToBack(E e){
        deque.remove(e);
        deque.offer(e);
    }
}
