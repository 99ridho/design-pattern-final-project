package mainpkg;

/**
 * Created by ridho on 5/26/17.
 */
public class Sorter<T> {

    private SortStrategy<T> strategy;

    public Sorter(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public Iterable<T> getSortedIterable(Iterable<T> i) {
        return strategy.doSort(i);
    }
}
