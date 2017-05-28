package mainpkg;

public interface SortStrategy<T> {
    Iterable<T> doSort(Iterable<T> i);
}
