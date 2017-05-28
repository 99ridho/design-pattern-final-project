package mainpkg;

public class SelectionSortStrategy<T> implements SortStrategy<T> {

    private static SelectionSortStrategy instance = null;

    public static SelectionSortStrategy getInstance() {
        if (instance == null) {
            instance = new SelectionSortStrategy<>();
        }

        return instance;
    }

    private SelectionSortStrategy() {}

    @Override
    public Iterable<T> doSort(Iterable<T> i) {
        T[] values = i.getValues();

        for (int outerIdx = 0 ; outerIdx < values.length - 1 ; outerIdx++) {
            int min = outerIdx;
            for (int innerIdx = outerIdx + 1 ; innerIdx < values.length ; innerIdx++) {
                if (Math.abs(values[innerIdx].hashCode()) < Math.abs(values[min].hashCode())) {
                    min = innerIdx;
                }
            }
            T temp = values[min];
            values[min] = values[outerIdx];
            values[outerIdx] = temp;
        }

        return new Sequence<T>(values);
    }
}
