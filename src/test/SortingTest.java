package test;

import mainpkg.Iterable;
import mainpkg.SelectionSortStrategy;
import mainpkg.Sequence;
import mainpkg.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {

    @Test
    public void testSortInteger() {
        Sequence<Integer> strSequence = new Sequence<Integer>(4, 5, 3, 1, 2);
        Sorter<Integer> sorter = new Sorter<Integer>(SelectionSortStrategy.getInstance());

        Iterable<Integer> sorted = sorter.getSortedIterable(strSequence);

        Assertions.assertArrayEquals(new Integer[]{1,2,3,4,5}, sorted.getValues());
    }

    @Test
    public void testSortString() {
        Sequence<String> strSequence = new Sequence<String>("malang", "jogja", "aceh", "surabaya");
        Sorter<String> sorter = new Sorter<String>(SelectionSortStrategy.getInstance());

        Iterable<String> sorted = sorter.getSortedIterable(strSequence);

        Assertions.assertArrayEquals(new String[]{"aceh", "jogja", "malang", "surabaya"}, sorted.getValues());
    }

}
