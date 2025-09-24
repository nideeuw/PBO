import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String nameCustomer;
    private ArrayList<Order> orderHistory;

    public Customer(String customerId, String nameCustomer) {
        this.customerId = customerId;
        this.nameCustomer = nameCustomer;
        this.orderHistory = new ArrayList<Order>();
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getNameCustomer() {
        return nameCustomer;
    }
    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }
    public void placeOrder(Order order) {
        orderHistory.add(order);
    }
    public void viewOrderHistory() {
        for (Order order : orderHistory) {
            System.out.println("Customer ID: " + getCustomerId() + ", Order ID: " + order.getOrderId() + ", Total Amount: " + order.getTotalAmount());
        }
    }
}