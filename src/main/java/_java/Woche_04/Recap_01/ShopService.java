package _java.Woche_04.Recap_01;

public class ShopService implements OrderRepo {
    private OrderRepo orderRepo;

    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public void removeOrder(Order order) {

    }

    @Override
    public Order searchOrder(int orderNumber) {
        return null;
    }
}
