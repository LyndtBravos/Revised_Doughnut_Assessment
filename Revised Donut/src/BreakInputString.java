import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BreakInputString {

    static class SortByOrderDate implements Comparator<Order> {
        public int Compare(Order a, Order b){
            return a.getOrderDate().compareTo(b.getOrderDate());
        }

        @Override
        public int compare(Order o1, Order o2) {
            return 0;
        }
    }

    static class SortByCollectionDate implements Comparator<Order>{
        public int Compare(Order a, Order b){
            return a.getCollectionDate().compareTo(b.getCollectionDate());
        }

        @Override
        public int compare(Order o1, Order o2) {
            return 0;
        }
    }

    static class SortBySurname implements Comparator<Order>{
        public int Compare(Order a, Order b){
            String surname1 = a.getSurname();
            String surname2 = b.getSurname();
            return surname1.compareTo(surname2);
        }

        @Override
        public int compare(Order o1, Order o2) {
            return 0;
        }
    }

    public String processOrder(String path) throws FileNotFoundException, ParseException {
        Order o1;
        Topping top = new Topping();
        String text = "";
        Scanner in = new Scanner(new File(path));
        ArrayList<Order> ordersList = new ArrayList<>();
        System.out.println();
        while(in.hasNext()){
            text = in.nextLine();

            String[] brokenString = text.split(",");
            String collectionDate = brokenString[1];
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(collectionDate);
            String orderDate = brokenString[0];
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(orderDate);
            String fullnames = brokenString[2];
            int donuts = Integer.parseInt(brokenString[3]);
            String[] nameSurname = fullnames.split(" ");
            String name = nameSurname[0];
            String surname = nameSurname[1];

            System.out.println(text);

            String topping = top.calculateTopping(donuts);
            o1 = new Order(date2, date1, name, surname, donuts, topping);
            o1.setToppingResults(topping);
            ordersList.add(o1);
            Collections.sort(ordersList, new SortByOrderDate());
        }

        System.out.println();
        Collections.sort(ordersList, new SortByCollectionDate().thenComparing(new SortBySurname()));
//        ordersList.forEach(values->{
//            System.out.println(values);
//        });

        ShoppingCart shop = new ShoppingCart();
        shop.showCart(ordersList);
        return text;
    }
}