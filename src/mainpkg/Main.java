package mainpkg;

/**
 * Created by ridho on 5/26/17.
 */
public class Main {
    public static void main(String[] args) {
        Sequence<String> strSequence = new Sequence<String>(new String[]{"test", "aaaa", "abcb", "cade", "cabe", "beca"});
        Sorter<String> sorter = new Sorter<String>(SelectionSortStrategy.getInstance());

        Iterable<String> sorted = sorter.getSortedIterable(strSequence);

        while (sorted.hasNext()) {
            System.out.println(sorted.next());
        }
    }
}
