//file IWaitList.java
package pract_8;

import java.util.Collection;

public interface IWaitList<E> {
    void add(E e);
    E remove();
    boolean contains(E e);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}
