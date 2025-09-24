public class RestoranMain {
    public static void main(String[] args) {
        // Membuat menu items
        Menu pizza = new Menu("M001", "Pizza", 50000, "Food");
        Menu burger = new Menu("M002", "Burger", 30000, "Food");
        Menu mieAyam = new Menu("M003", "Mie Ayam", 12000, "Food");
        Menu iceTea = new Menu("M004", "Ice Tea", 6000, "Drink");
        Menu hotOrange = new Menu("M005", "Hot Orange", 7000, "Drink");

        // Membuat employee
        Employee employee1 = new Employee("E001", "Fiza", "Waiter");
        Employee employee2 = new Employee("E002", "Dyah", "Waiter");

        // Membuat customers
        Customer customer1 = new Customer("C001", "Farhan");
        Customer customer2 = new Customer("C002", "Nida");

        // Membuat orders
        Order order1 = new Order("O001", customer1, employee1);
        order1.addOrder(new OrderDetail(mieAyam, 2));
        order1.addOrder(new OrderDetail(burger, 3));
        order1.addOrder(new OrderDetail(iceTea, 3));

        Order order2 = new Order("O002", customer2, employee2);
        order2.addOrder(new OrderDetail(pizza, 2));
        order2.addOrder(new OrderDetail(burger, 2));
        order2.addOrder(new OrderDetail(hotOrange, 2));

        // Menambahkan orders ke customer history
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Mencetak struk
        order1.printReceipt();
        order2.printReceipt();

        // Menampilkan riwayat pesanan pelanggan
        System.out.println("--------------------------------------------------------");
        System.out.println("                    Order History                       ");
        System.out.println("--------------------------------------------------------");
        customer1.viewOrderHistory();
        customer2.viewOrderHistory();
        System.out.println("========================================================");
    }
}