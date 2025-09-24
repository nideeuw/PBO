public class OrderDetail {
    private Menu menu;
    private int qty;

    public OrderDetail(Menu menu, int qty) {
        this.menu = menu;
        this.qty = qty;
    }
    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
}