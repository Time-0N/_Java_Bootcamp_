package _java.Woche_04.Recap_01;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {
    private List<Order> orderList;

    public List<Order> getOrderList() {
        return orderList;
    }

    public OrderListRepo() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
    }

    public Order searchOrder(int orderNumber) {
        for (Order order : orderList) {
            if (order.orderNumber() == orderNumber) {
                return order;
            }
        }
        return null;
    }
}
