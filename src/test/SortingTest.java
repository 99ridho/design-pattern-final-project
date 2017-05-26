package test;

import mainpkg.Iterable;
import mainpkg.SelectionSortStrategy;
import mainpkg.Sequence;
import mainpkg.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by ridho on 5/26/17.
 */
public class SortingTest {

    @Test
    public void testSortInteger() {
        Integer[] arr = {4,5,2,1,3};
        Sequence<Integer> strSequence = new Sequence<Integer>(arr);
        Sorter<Integer> sorter = new Sorter<Integer>(SelectionSortStrategy.getInstance());

        Iterable<Integer> sorted = sorter.getSortedIterable(strSequence);

        while (sorted.hasNext()) {
            System.out.println(sorted.next());
        }

        Assertions.assertArrayEquals(new Integer[]{1,2,3,4,5}, sorted.getValues());
    }

}
