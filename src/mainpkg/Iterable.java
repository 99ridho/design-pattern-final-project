package mainpkg;

/**
 * Created by ridho on 5/26/17.
 */
public interface Iterable<T> {

    T next();
    boolean hasNext();
    int count();
    T[] getValues();

}
