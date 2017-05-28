package mainpkg;

public class Sorter<T> {

    private SortStrategy<T> strategy;

    public Sorter(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public Iterable<T> getSortedIterable(Iterable<T> i) {
        return strategy.doSort(i);
    }
}
