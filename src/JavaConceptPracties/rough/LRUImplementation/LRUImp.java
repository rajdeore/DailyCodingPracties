package JavaConceptPracties.rough.LRUImplementation;

import java.util.*;

public class LRUImp implements CacheManger {
    private List<Integer> cache;
    private int size;

    public LRUImp(int size) {
        cache = new LinkedList<>();
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "cache=" + cache
                        ;
    }

    public boolean isEmpty() {
        if (cache.size() < size) {
            return true;
        }
        return false;
    }

    @Override
    public void addElement(Integer i) {
        //if cache contain that key
        // then remove it and add it to the end
        //if not contain it
        //then check if cache is empty
        //if empty ---> then add to the end
        //else ----> remove the 1st element(least used recently)

        if (cache.contains(i)) {
            remove(i);
            cache.add(i);
        } else {
            if (isEmpty()) {
                cache.add(i);
            } else {
                cache.remove(0);
                cache.add(i);
            }
        }


    }

    @Override
    public void remove(Integer i) {
        cache.remove(i);
    }

    @Override
    public boolean containElement(Integer i) {
        return true;
    }
}
