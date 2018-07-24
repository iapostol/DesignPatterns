package behavioral.iterator;

import behavioral.iterator.numbers.Integers;
import behavioral.iterator.numbers.Mapper;
import behavioral.iterator.numbers.Taker;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class SquareNumbersIteratorTest {

    @Test
    public void primeTest() {
        printAll(take(25, squareOf(Integers.all())));
    }

    private static void printAll(List<Integer> list){
        for(int i : list)
            System.out.println(i);
    }

    private static List<Integer> take(int n, Iterator<Integer> xs){
        return new Taker<Integer>().take(n, xs);
    }

    private static Iterator<Integer> squareOf(Iterator<Integer> xs){
        return new Mapper<Integer>().map(x -> x * x, xs);
    }
}
