package behavioral.iterator.numbers;

import java.util.Iterator;

public class Integers implements Iterable<Integer> {
    public static Integers listOfAll = new Integers();
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {

            private int i = 1;

            public boolean hasNext() {
                return true;
            }

            public Integer next() {
                return i++;
            }

            public void remove(){}
        };
    }


    public static Iterator<Integer> all() {
        return new Integers().iterator();
    }
}
