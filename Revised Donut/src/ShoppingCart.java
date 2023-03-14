import java.util.ArrayList;

public class ShoppingCart {

    public String showCart(ArrayList<Order> List){
        List.forEach(values ->{
            System.out.println(values);
        });
        return null;
    }
}