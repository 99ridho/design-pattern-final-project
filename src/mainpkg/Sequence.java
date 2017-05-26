package mainpkg;

/**
 * Created by ridho on 5/26/17.
 */
public class Sequence<T> implements Iterable {

    private T[] values;
    private int currentIndex;

    public Sequence(T[] values) {
        this.values = values;
        currentIndex = 0;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return values[currentIndex++];
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < count();
    }

    @Override
    public int count() {
        return values.length;
    }

    @Override
    public T[] getValues() {
        return values;
    }
}
