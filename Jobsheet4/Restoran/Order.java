import java.util.ArrayList;

public class Order {
    private String orderId;
    private Customer customer;
    private Employee employee;
    private ArrayList<OrderDetail> orderDetail;
    private int totalAmount;

    public Order(String orderId, Customer customer, Employee employee) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.orderDetail = new ArrayList<OrderDetail>();
        this.totalAmount = 0;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addOrder(OrderDetail orderDetail) {
        this.orderDetail.add(orderDetail);
        calculateTotal();
    }

    public ArrayList<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public int calculateTotal() {
        totalAmount = 0;
        for (OrderDetail orderDetail : orderDetail) {
            totalAmount += orderDetail.getMenu().getPrice() * orderDetail.getQty();
        }
        return totalAmount;
    }

    public void printReceipt() {

        calculateTotal();

        // Mencetak informasi struk
        System.out.println("=====================================================");
        System.out.println("                 RESTAURANT RECEIPT                 ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Employee    : " + employee.getName() + " (" + employee.getRole() + ")");
        System.out.println("Customer    : " + customer.getNameCustomer());
        System.out.println("Order ID    : " + orderId);
        System.out.println("-----------------------------------------------------");

        // Mencetak menu items
        System.out.println("Items Ordered:");
        for (OrderDetail detail : orderDetail) {
            int totalPrice = detail.getMenu().getPrice() * detail.getQty();
            System.out.printf("%-25s x%-1d %-10d =  Rp %-5d\n",
                    detail.getMenu().getMenuName(),
                    detail.getQty(),
                    detail.getMenu().getPrice(),
                    totalPrice);
        }

        // Mencetak total amount
        System.out.println("-----------------------------------------------------");
        System.out.printf("Total Amount    : Rp %-5d\n", totalAmount);
        System.out.println("=====================================================");
        System.out.println();
    }
}