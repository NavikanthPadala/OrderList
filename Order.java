package shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<OrderDetails> orderDetailsList;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDetailsList = new ArrayList<>();
    }

    public String getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }

    public void addOrderDetail(OrderDetails detail) {
        orderDetailsList.add(detail);
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    @Override
    public String toString() {
        return "\nOrderId=" + orderId + ", Customer=" + customer + ", Items=" + orderDetailsList;
    }
}
