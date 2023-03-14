import java.io.FileNotFoundException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        String path = "C:\\Users\\dell\\Documents\\Revised Donut\\Sample Input.txt";
        BreakInputString bis = new BreakInputString();
        bis.processOrder(path);
    }
}
