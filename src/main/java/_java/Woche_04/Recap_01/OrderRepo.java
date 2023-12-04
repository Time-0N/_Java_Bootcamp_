package _java.Woche_04.Recap_01;

public interface OrderRepo {
    void addOrder(Order order);

    void removeOrder(Order order);

    Order searchOrder(int orderNumber);
}
