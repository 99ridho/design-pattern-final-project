package mainpkg;

public interface Iterable<T> {

    T next();
    boolean hasNext();
    int count();
    T[] getValues();

}
