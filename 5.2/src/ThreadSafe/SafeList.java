package ThreadSafe;

import java.util.ArrayList;
import java.util.List;

class SafeList<E> {
    private final List<E> list = new ArrayList<>();

    public synchronized void add(E element) {
        list.add(element);
    }

    public synchronized void remove(E element) {
        list.remove(element);
    }

    public synchronized int size() {
        return list.size();
    }
}
