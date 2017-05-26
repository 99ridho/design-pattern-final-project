package mainpkg;

/**
 * Created by ridho on 5/26/17.
 */
public interface SortStrategy<T> {
    Iterable<T> doSort(Iterable<T> i);
}
