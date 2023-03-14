import java.util.Comparator;
import java.util.function.Function;

public class SortBy {

    static class SortByOrderDate implements Comparator<Order> {
        public int Compare(Order a, Order b) {
            return a.getOrderDate().compareTo(b.getOrderDate());
        }
    }

    static class SortByCollectionDate implements Comparator<Order> {
        public int Compare(Order a, Order b) {
            return a.getCollectionDate().compareTo(b.getCollectionDate());
        }
    }
}
