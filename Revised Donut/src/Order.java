import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {

    private Date orderDate;
    private Date collectionDate;
    private String name;
    private String surname;
    private int donutOrdered;
    private String toppingResults;

    public Order(Date orderDate, Date collectionDate, String name, String surname, int donutOrdered, String toppingResults) {
        this.orderDate = orderDate;
        this.collectionDate = collectionDate;
        this.name = name;
        this.surname = surname;
        this.donutOrdered = donutOrdered;
        this.toppingResults = toppingResults;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDonutOrdered() {
        return donutOrdered;
    }

    public void setDonutOrdered(int donutOrdered) {
        this.donutOrdered = donutOrdered;
    }

    public String getToppingResults() {
        return toppingResults;
    }

    public void setToppingResults(String toppingResults) {
        this.toppingResults = toppingResults;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String date1 = sdf.format(collectionDate);
        return  date1 + "," + name + "," + surname + "," + toppingResults;
    }
}